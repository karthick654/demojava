package com.example.demo;


class Animal{
	void eat() {
		System.out.println("food");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("Wowww");
	}
}

class Cat extends Animal {
	void walk() {
		System.out.println("goat");
	}
}
public class Hierarchial {
	public static void main(Demo args[]) {
		Cat Obj = new Cat();
		Obj.eat();
//		Obj.bark();
		Obj.walk();
	}
}
