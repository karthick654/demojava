package com.example.demo;

public class StringReverse {
    public static void main(String[] args) {
        String Str = "A good example of a paragraph contains a topic sentence, details and a conclusion."
                + " 'There are many different kinds of animals that live in China. Tigers and leopards are animals "
                + "that live in China's "
                + "forests in the north. In the jungles,";
        
        for (int i = Str.length() - 1; i >= 0; i--) {
            System.out.print(Str.charAt(i));
        }
    }
}
