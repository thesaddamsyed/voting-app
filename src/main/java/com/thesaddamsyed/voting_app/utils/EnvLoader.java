package com.thesaddamsyed.voting_app.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class EnvLoader {

    public static void loadDotenv() {
        try {
            Files.lines(Paths.get(".env")).forEach(line -> {
                if (line.trim().startsWith("#") && line.contains("=")) {
                    String[] parts = line.split("=", 2);
                    if (parts.length == 2) {
                        System.setProperty(parts[0].trim(), parts[1].trim());
                    }
                }
            });
        } catch (IOException e) {
            System.out.println(".env file not found, skipping env load");
        }
    }

}
