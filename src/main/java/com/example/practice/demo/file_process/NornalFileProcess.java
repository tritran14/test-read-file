package com.example.practice.demo.file_process;

import com.example.practice.demo.model.MemoryStats;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;

@Configuration
public class NornalFileProcess {
    @PostConstruct
    public void solve() {
        // Adjust the file path to the location of your large file
        String filePath = "/Users/tvtri/Downloads/Bee12/demo/src/main/resources/output.json";

        System.out.println(getMemoryStatistics());

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            StringBuilder content = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                content.append(line);
//                System.out.println(line);
            }

            // Attempt to allocate a large amount of memory by converting the content to a String
            String largeString = content.toString();

            // If the file is too large, this may trigger an OutOfMemoryError
            System.out.println("Reading and storing the content completed.");
        } catch (OutOfMemoryError e) {
            System.err.println("OutOfMemoryError occurred. The file is too large to fit into memory.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public MemoryStats getMemoryStatistics() {
        MemoryStats stats = new MemoryStats();
        stats.setHeapSize(Runtime.getRuntime().totalMemory());
        stats.setHeapMaxSize(Runtime.getRuntime().maxMemory());
        stats.setHeapFreeSize(Runtime.getRuntime().freeMemory());
        return stats;
    }
}
