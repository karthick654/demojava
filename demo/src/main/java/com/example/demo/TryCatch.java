package com.example.demo;

public class TryCatch {
	public static void main(String[] args) {
		int i,j,k;
		i=10;
		j=0;
		try
		{
			k = i/j;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
//		System.out.println(k);
	}

}
