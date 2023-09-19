package com.example.demo;

public class CompareArray {
    public static void main(String[] args) {
        int[][] Array = { { 0, 1 }, { 2, 4, 6 }, { 7, 8, 9 } };

        System.out.print("{");

        for (int i = Array.length - 1; i >= 0; i--) {
           
            System.out.print("{");

            for (int j = Array[i].length - 1; j >= 0; j--) {
                
                System.out.print(Array[i][j]+",");

       }

        System.out.print("}");
    }
}
}
