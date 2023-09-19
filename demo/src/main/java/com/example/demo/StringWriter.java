package com.example.demo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.charset.StandardCharsets;

public class StringWriter {
    public static void main(String[] args) {
        File files = new File("String.docx");
        try {
            String text = "welcome for java";

            Path filename = Path.of("String.docx");

            Files.writeString(filename, text, StandardCharsets.UTF_8);

            String fileCont = Files.readString(filename, StandardCharsets.UTF_8);
            
            System.out.println("File Content: " + fileCont);
            System.out.println(files.getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
