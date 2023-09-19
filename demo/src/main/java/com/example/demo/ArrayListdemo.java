package com.example.demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayListdemo {
    public static void main(String[] args) {
        ArrayList<Integer> Arrlist = new ArrayList<Integer>();
        for (int i = 1; i < 10; i++) {
            Arrlist.add(i);
            Arrlist.set(0,55);
//            Arrlist.clear();
            Arrlist.clone();
        }
        System.out.println(Arrlist);
        
        ArrayList<Integer> slist = new ArrayList<Integer>(); // Use generics
        slist.add(100);
        System.out.println(slist);
        
        
        PriorityQueue<String> demo = new PriorityQueue<String>();
        
        demo.add("karthi");
        demo.add("Anbu");
        System.out.println(demo.size());
        System.out.println(demo.remove());
        
        
    }
}
