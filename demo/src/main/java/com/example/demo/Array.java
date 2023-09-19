package com.example.demo;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int a[] = {10, 4, 6, 5, 7, 8, 99};
        Arrays.sort(a); 

        for (int i = 0; i <a.length; i++) {
            int b = a[i];
            System.out.println(b);
        }
    }
}
//Arraylist<Integer>