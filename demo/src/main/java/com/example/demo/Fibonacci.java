package com.example.demo;

public class Fibonacci {
	static int n1=0,n2=1,n3=2;
	static void DemoFib(int n) {
		if(n>0) {
			n3 = n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n3);
			DemoFib(n-1);
		}
	}
	public static void main(String[] args) {
		int n = 7;
		DemoFib(n-2);
//		System.out.println(n1+""+n2);
	}

}
