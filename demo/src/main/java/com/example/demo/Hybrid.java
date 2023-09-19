package com.example.demo;

class Grandparent {
    void grandparentMethod() {
        System.out.println("Method in Grandparent class");
    }
}

class Parent1 extends Grandparent {
    void parent1Method() {
        System.out.println("Method in Parent1 class");
    }
}

class Parent2 {
    void parent2Method() {
        System.out.println("Method in Parent2 class");
    }
}

class Child extends Parent1 {
    void childMethod() {
        System.out.println("Method in Child class");
    }
}

public class Hybrid {
    public static void main(Demo[] args) {
        Child child = new Child();
        child.grandparentMethod(); 
        child.parent1Method();     
        child.childMethod();       

        Parent2 parent2 = new Parent2();
        parent2.parent2Method();   
    }
}
