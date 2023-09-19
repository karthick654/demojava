package com.example.demo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsDemo {
	public static void main(String[] args) {
		TreeSet <String> newSet = new TreeSet<String>();
		TreeSet<Integer> oldset = new TreeSet<Integer>();
		
		oldset.add(10);
		oldset.add(50);
		oldset.add(30);
		oldset.add(100);
		
		newSet.add("Monday");
		newSet.add("Tuesday");
		newSet.add("wedensday");
		newSet.add("Thursday");
		newSet.add("Friday");
		newSet.add("Saturday");
		newSet.add("Sunday");
		newSet.add("Monday");
//		newSet.remove(newSet);
		System.out.println(newSet);
		System.out.println(oldset);
	}
}
