package com.example.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JsonDemo {
    public static void main(String[] args) {
       
        String inputFile = "employee.txt";
        String outputFile = "employee.xls";

        try {
            
            FileReader fileReader = new FileReader(inputFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

        
            FileWriter fileWriter = new FileWriter(outputFile);

            
            fileWriter.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
            fileWriter.write("<employee>\n");

   
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                fileWriter.write("    <content>" + line + "</content>\n");
            }

        
            fileWriter.write("</employee>\n");
            fileWriter.close();
            
            bufferedReader.close();

            System.out.println("The text converted from txt to xls file");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
//            e.printStackTrace();
        }
    }
}
