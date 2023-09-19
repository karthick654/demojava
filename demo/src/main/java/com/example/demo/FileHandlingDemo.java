package com.example.demo;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingDemo {
    public static void main(String[] args) {
        File file = new File("newfile.txt");
        try {
            boolean fileCreated = file.createNewFile();
            
            if (fileCreated) {
                System.out.println("The new file is created");
            } else {
                System.out.println("The file already exists");
            }
            System.out.println("File path: " + file.getAbsolutePath());// to get the filepath in java
            
            // Check if the file exists before trying to read it
            if (file.exists()) {
                FileReader input = new FileReader(file);
                int data;
                StringBuilder content = new StringBuilder();

                while ((data = input.read()) != -1) {
                    content.append((char) data);
                }

                input.close();

                System.out.println("File content: " + content.toString());
            } else {
                System.out.println("The file does not exist");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
