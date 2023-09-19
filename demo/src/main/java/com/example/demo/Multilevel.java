package com.example.demo;

//class Animal{
//	void bark() {
//		System.out.println("wow");
//	}
//}
//class Dog extends Animal{
//	void eat() {
//		System.out.println("weeping");
//	}
//}
//
//class BabyDog extends Dog{
//	void cry() {
//		System.out.println("barking");
//	}
//}
//
//public class Multilevel {
//	public static void main(String args[]) {
//		BabyDog Obj = new BabyDog();
//		Obj.bark();
//		Obj.eat();
//		Obj.cry();
//	}
//}

class Firstnum{
	int num1,num2,num3,num4;
	
	void add() {
		num1 = 10;
		num2 = 20;
	}
}
class Secondnum extends Firstnum{
	void sub() {
		num3 = 30;
		num4 = 40;
	}
}

class Resultnum extends Secondnum{
	void result() {
		int result1 = num1 + num2;
		System.out.println("The addition of two numbers is :"+result1);
		int result2 = num4-num3;
		System.out.println("The subtraction of two numbers is :"+result2);
	}
}

public class Multilevel{
	public static void main(Demo args[]) {
		Resultnum Obj = new Resultnum();
		Obj.add();
		Obj.sub();
		Obj.result();
	}
}
