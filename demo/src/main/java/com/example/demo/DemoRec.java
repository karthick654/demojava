package com.example.demo;



public class DemoRec {
	static int fact(int n) {
		if(n==0) {
			return 1;
		}
		return n*fact(n-1);
	}
	public static void main(String[] args) {
		int n = 6;
		System.out.println(fact(n));
	}
}
