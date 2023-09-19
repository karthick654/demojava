package com.example.demo;

import java.io.File;

public class FolderCreation {
	public static void main(String[] args) {
		File folder = new File("arrayTest");
		
		try {
			boolean newfolder = folder.mkdir();
			if(newfolder) {
				System.out.println("The folder created successfully");
			}
			else {
				System.out.println("The folder not created");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
