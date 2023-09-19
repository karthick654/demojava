package com.example.demo;
import java.util.*;
public class Dequedemo {
	public static void main(String[] args) {
		Deque<String> demo = new ArrayDeque<String>();
		
		demo.add("");
		demo.add("Ramesh");
		demo.add("Rajesh");
		demo.add("Dinesh");
//		demo.remove();
		
		for(String s:demo) {
			System.out.println(s);
//			System.out.println("--------------------");
//			System.out.println("the removed elements are"+demo.offer(s));
//			System.out.println(demo.peek());
		}
	}
}
