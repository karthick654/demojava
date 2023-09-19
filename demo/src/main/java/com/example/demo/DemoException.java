package com.example.demo;

public class DemoException {
	public static void main(String[] args) {
		String S1 = "welcome to the java world";
//		System.out.println(S1.length());
		try
			{
				char c = S1.charAt(26);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}


