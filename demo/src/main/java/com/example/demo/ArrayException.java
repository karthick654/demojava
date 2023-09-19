package com.example.demo;

public class ArrayException {
    public static void main(String[] args) {
        int a[] = {1, 4, 6, 8, 13, 15};
        try {
            for (int i = 0; i < a.length; i++) {
                if (a[i] % 2 == 0) {
                    System.out.println(a[i]);
                }
            }

            for (int i = 0; i < a.length; i++) {
                if (a[i] % 3 == 0) {
                    System.out.println(a[i]);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
