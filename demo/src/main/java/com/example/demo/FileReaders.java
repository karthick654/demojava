package com.example.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaders {
    public static void main(String[] args) {
        File folder = new File("D:\\KT-session-Java\\demo");
        File file = new File(folder, "array.txt");

        try {
            if (!folder.exists()) {
                boolean folderCreated = folder.mkdir();
                if (folderCreated) {
                    System.out.println("The folder created successfully");
                } else {
                    System.out.println("The folder could not be created");
                }
            } else {
                System.out.println("The folder already exists");
            }

            if (!file.exists()) {
                boolean fileCreated = file.createNewFile();
                if (fileCreated) {
                    System.out.println("The file is created");
                } else {
                    System.out.println("The file already exists");
                }
            } else {
                System.out.println("The file already exists");
            }

            if (file.exists()) {
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line;
                StringBuilder content = new StringBuilder();

                while ((line = bufferedReader.readLine()) != null) {
                    content.append(line);
                }

                bufferedReader.close();

                System.out.println("File content:\n" + content.toString());
            } else {
                System.out.println("The file does not exist");
            }

            System.out.println("The file path is: " + file.getAbsolutePath());
            System.out.println("The file can be read or not: " + file.canRead());
            System.out.println("The file is writable or not: " + file.canWrite());
            System.out.println("The length of the file is: " + file.length());
            System.out.println("The relative path is :"+file.getPath());
        } catch (IOException e) {
            System.out.println("An error occurred: " + e);
        } finally {
            System.out.println("Always execute");
        }
    }
}
