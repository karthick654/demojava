package com.example.demo;

class test{
    String string = "karthickdk";
}

public class Demo {
    public static void main(String args[]) {
        test instance = new test(); 
        int count = 0;

        for (int i = 0; i < instance.string.length(); i++) {
            if (instance.string.charAt(i) != ' ') {
                count++;
            }
        }

        System.out.println(count);
    }
}
