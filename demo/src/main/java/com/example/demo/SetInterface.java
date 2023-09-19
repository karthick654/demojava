package com.example.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SetInterface {
	public static void main(String[] args) {
		Set<Integer> a = new HashSet<Integer>();
		a.addAll(Arrays.asList(new Integer[] {1, 3, 2, 4, 8, 9, 0}));
		
		Set<Integer> b = new HashSet<Integer>();
		b.addAll(Arrays.asList(new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5}));
		
		Set<Integer> union = new HashSet<Integer>(a);
		union.addAll(b);
		System.out.println("Th union is :"+union);
		
		Set<Integer> Intersection = new HashSet<Integer>(a);
		Intersection.retainAll(b);
		System.out.println("The Intersection is :"+Intersection);
		
		Set<Integer> Diffrence = new HashSet<Integer>(a);
		Diffrence.removeAll(b);
		System.out.println("The Diffrence is :"+Diffrence);
		
		
		HashMap<Integer,String> h = new HashMap<Integer,String>();
		h.put(555,"karthi");
		h.put(222, "Sakthi");
		System.out.println(h.toString());
	}
}
