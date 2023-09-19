package com.example.demo;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;
import java.util.List;
//class students implements Comparable<Student>{
//	
//}
public class DemoList {
	public static void main(String[] args) {
		List<String> d = new ArrayList<String>();
		d.add("welcome");
		d.add("to");
		d.add("java");
		Collections.sort(d);
		for(String u:d) {
			System.out.println(u);
		}
	}
}
//comparable and comparator in collections 
//jdbc