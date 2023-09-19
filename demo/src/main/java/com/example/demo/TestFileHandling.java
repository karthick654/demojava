package com.example.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.CSVWriter;

public class TestFileHandling {
    public static void main(String[] args) {
        File file = new File("students.csv");
        try {
            FileWriter exitFile = new FileWriter(file);
            CSVWriter writer = new CSVWriter(exitFile);

            String[] header = {"Name", "Class", "Marks"};
            writer.writeNext(header);

            String[] data1 = {"Arun", "10", "440"};
            writer.writeNext(data1);

            String[] data2 = {"Akash", "10", "444"};
            writer.writeNext(data2);
            
            String[] data3 = {"Anbu", "10", "500"};
            writer.writeNext(data3);
            
            writer.close();
            exitFile.close();
            System.out.println("Students data successfully entered");
            System.out.println(file.getAbsolutePath());

            
            TestFileHandling testFileHandling = new TestFileHandling();
            testFileHandling.Readingfile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Readingfile() {
        try {
            BufferedReader readfile = new BufferedReader(new FileReader("students.csv"));
            String readFilerow;
            while ((readFilerow = readfile.readLine()) != null) {
                String[] data = readFilerow.split(",");
                System.out.println(data[0] + "|" + data[1] + "|" + data[2]);
            }
            readfile.close();
        } catch (IOException e) { 
            e.printStackTrace();
        }
    }
}
