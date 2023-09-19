package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxing {
	public static void main(String[] args) {
		int primitiveInt = 42;
        Integer wrappedInt = primitiveInt; // Autoboxing
        
        double primitiveDouble = 3.14;
        Double wrappedDouble =(double) primitiveDouble; // Autoboxing
        
        char primitiveChar = 'A';
        Character wrappedChar = primitiveChar; // Autoboxing
        
        // Unboxing: Converting wrapper classes back to primitive types
        int unboxedInt = wrappedInt; // Unboxing
        
        double unboxedDouble = wrappedDouble; // Unboxing
        
        char unboxedChar = wrappedChar; // Unboxing
        
        System.out.println("Autoboxing and Unboxing Example:");
        System.out.println("Primitive Int: " + primitiveInt);
        System.out.println("Wrapped Int: " + wrappedInt);
        System.out.println("Unboxed Int: " + unboxedInt);
        
        System.out.println("Primitive Double: " + primitiveDouble);
        System.out.println("Wrapped Double: " + wrappedDouble);
        System.out.println("Unboxed Double: " + unboxedDouble);
        
        System.out.println("Primitive Char: " + primitiveChar);
        System.out.println("Wrapped Char: " + wrappedChar);
        System.out.println("Unboxed Char: " + unboxedChar);
        
        // Autoboxing and Unboxing in collections
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1); // Autoboxing
        numbers.add(2); // Autoboxing
        
        int firstNumber = numbers.get(0); // Unboxing
        int secondNumber = numbers.get(1); // Unboxing
        
        System.out.println("Numbers List:");
        System.out.println("First Number: " + firstNumber);
        System.out.println("Second Number: " + secondNumber);
	}
}
