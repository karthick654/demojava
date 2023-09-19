package com.example.demo;

class Rectangle{
	int length,width;
	
	void getValues(int x,int y) {
		length = x;
		width = y;
	}
	
	int area() {
		int a = length * width;
		return a;
	}
}
public class Class {
	public static void main(Demo args[]) {
		Rectangle Obj1 = new Rectangle();
		Obj1.length = 20;
		Obj1.width = 30;
		System.out.println("Area of rectangle :"+Obj1.area());
	}

}
