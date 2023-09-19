package com.example.demo;


//Single inheritance
//
//class Animal{      //main class
//	void eat() {
//		System.out.println("eating");
//	}
//}
//
//class Child extends Animal{   //derived class
//	void nature() {
//		System.out.println("barking");
//	}
//}
//
//
//public class Inheritance {
//	public static void main(String args[]) {
//		Child Obj = new Child();
//		Obj.eat();
//		Obj.nature();
//	}
//}

class Addition {
    public int num1;
    public int num2;

    public void values() {
        num1 = 10;
        num2 = 20;
    }

    public void values(int n1, int n2) {
        num1 = n1;
        num2 = n2;
    }

    public void values(double a1, double a2, double a3) {
        num1 = (int) a1; 
        num2 = (int) (a2 + a3); 
    }
}

class Subtraction extends Addition {
    public void solution() {
        int answer = num1 + num2;
        System.out.println("The addition of values is: " + answer);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Subtraction Obj1 = new Subtraction();
        Obj1.values();
        Obj1.solution();

        Obj1.values(30, 40);
        Obj1.solution();
        
        Obj1.values(90.5, 20.8, 30.3);
        Obj1.solution();
    }
}
