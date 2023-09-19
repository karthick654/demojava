package com.example.demo;

public class ArrayCompare {
    public static void main(String[] args) {
        int a[] = {1, 4, 6, 7, 3, 15, 20, 1, 4, 6};

        System.out.println("Multiples of 2:");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
            }
        }

        System.out.println("Multiples of 3:");
        for (int j = 0; j < a.length; j++) {
            if (a[j] % 3 == 0) {
                System.out.println(a[j]);
            }
        }
        System.out.println("Multiples of 1");
        for(int l=0;l<a.length; l++) {
        	if(a[l]%1==0) {
        		System.out.println(a[l]);
        	}
        }
        System.out.println("Multiples of 0");
        for (int k = 0; k < a.length; k++) {
            if (a[k]%0==0) {
                System.out.println("Invalid input");
            }
        }
    }
}
