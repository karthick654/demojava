package com.example.demo;

public class ArrayOfArray {
	public static void main(String[] args) {
		int[][] array = { { 0, 1 }, { 2, 4, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < array.length; i++) {
		  
		    int newArray = array[i][1];
		    
		    
		    for (int j = 1; j < array[i].length; j++) {
		      
		        if (array[i][j] > newArray) {
		        	newArray = array[i][j];
		        }
		    }
		    
		  
		    System.out.println("The biggest number in subarray " + (i) + " is: " + newArray);
		}
		}
		
	
}
