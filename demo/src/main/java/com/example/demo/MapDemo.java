package com.example.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {
		Map<Integer,String> map = new TreeMap<Integer,String>();
		map.put(101,"amit");
		map.put(102, "maas");
		map.put(103, "maas");
		System.out.println(map);
		
	}
}
