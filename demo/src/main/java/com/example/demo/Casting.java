package com.example.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Casting {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the double num");
		double num1 = sc.nextDouble();
		
		System.out.println("Enter  the integer num");
		int num2 = sc.nextInt();

		double num3  = (double) num2;
		
		double solution = num3+num1;
		System.out.println("the final solution is:"+solution);
		
		
		int i = 10;
		
		double d = i;
		System.out.println(d);
		
		
		int i2 = 15;
		
		String str1 = String.valueOf(i2);
		System.out.println(str1);
		
		String str2 = "10";
		System.out.println(Integer.parseInt(str2));
		
		
		int num = 10;
		String str3 = Integer.toString(num);
		System.out.println(str3);
		
		int numb1 = 10;
		long numb2 = 20;
		long sum = numb1 + numb2;
		System.out.println(sum);
		
		ArrayList names = new ArrayList();
		names.add("abcd"); 
		names.add(1); 

		String name = (String) names.get(0); //OK
		name = (String) names.get(1); 

	}
}
