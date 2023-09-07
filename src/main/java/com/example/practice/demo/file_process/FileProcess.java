package com.example.practice.demo.file_process;

import com.example.practice.demo.model.Port;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

//@Configuration
public class FileProcess {
    @PostConstruct
    public void solve() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(JsonParser.Feature.AUTO_CLOSE_SOURCE, true);
        InputStream inputStream = this.getClass().getResourceAsStream("/output.json");
        JsonParser jsonParser = objectMapper.getFactory().createParser(inputStream);

        int cnt=0;
        jsonParser.nextToken();
        while (!jsonParser.isClosed()) {
            jsonParser.nextToken();

            if (jsonParser.currentToken() == JsonToken.START_OBJECT) {
                String keyName = jsonParser.currentName();

                jsonParser.nextToken();

                String valueJson = jsonParser.readValueAsTree().toString();

                System.out.println("Key: " + keyName);
//                System.out.println("Value JSON: " + valueJson);
                ++cnt;
            }
        }
        System.out.println(cnt);
    }
}
