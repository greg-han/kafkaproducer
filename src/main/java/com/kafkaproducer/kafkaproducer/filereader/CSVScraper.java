package com.kafkaproducer.kafkaproducer.filereader;

import com.kafkaproducer.kafkaproducer.kafkaproducers.KafkaProducer;
import com.kafkaproducer.kafkaproducer.model.Song;
import com.kafkaproducer.kafkaproducer.utils.MutateSong;
import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

@Component
public class CSVScraper {
    @Value("${iterations}")
    private int iterations;
    private KafkaProducer kafkaProducer;
    private MutateSong mutateSong;

    public CSVScraper(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    public void processSongs() {
        String filePath = "/Users/gregbook/IdeaProjects/kafkaproducer/src/main/resources/lyrics.csv";

        //stash change
        mutateSong = new MutateSong();
        List<Song> songs;
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
                songs = new CsvToBeanBuilder<Song>(reader)
                       .withType(Song.class)
                       .build()
                       .parse();
            kafkaProducer.sendMessage(songs.get(2));

        for(int i = 0; i < iterations; i++) {
            for (Song song : songs) {
                System.out.println(song);
                Song mutatedSong = mutateSong.mutate(song);
                System.out.println(mutatedSong);
                kafkaProducer.sendMessage(song);
            }

        }


        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
