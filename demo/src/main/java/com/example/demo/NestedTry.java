package com.example.demo;

public class NestedTry {
	public static void main(String[] args) {
		try
		{
			try
			{
				int num = Integer.parseInt("10");
				System.out.println(num);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			try {
				String S1 = "welcome to the Exception";
//				System.out.println(S1.length());
				char c = S1.charAt(25);
				System.out.println(c);
			}
			catch(Exception e2) {
				System.out.println(e2);
			}
			try {
				int a[] = new int[10];
				a[0]=20;
				System.out.println(a[0]);
			}
			catch(Exception e3) {
				System.out.println(e3);
			}
		}
		catch(Exception e4) {
			System.out.println(e4);
		}
		finally {
			System.out.println("I will be run always");
		}
	}

}
