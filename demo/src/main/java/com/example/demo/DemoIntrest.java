package com.example.demo;

import java.util.Scanner;

class Bank {
    public double principal;
    public int years;

    public Bank(double principal, int years) {
        this.principal = principal;
        this.years = years;
    }

    public double calculateSimpleInterest() {
        return (principal * years * getRate()) / 100;
    }

    protected double getRate() {
        return 0; 
    }
}

class HDFCS extends Bank {
    public HDFCS(double principal, int years) {
        super(principal, years);
    }

    public double getRate() {
        return 8.0; 
    }
}

class SBI extends Bank {
    public SBI(double principal, int years) {
        super(principal, years);
    }

    protected double getRate() {
        return 7.5; 
    }
}

public class DemoIntrest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.println("Enter number of years: ");
        int years = scanner.nextInt();
        
        System.out.println("Enter the Bank name");
        String bankName = scanner.next();

        double interestA = 0.0;
        double interestB = 0.0;
    
        HDFCS bankA = new HDFCS(principal, years);
        SBI bankB = new SBI(principal, years);

        switch (bankName.toUpperCase()) {
            case "HDFC":
                interestA = bankA.calculateSimpleInterest();
                break;
            case "SBI":
                interestB = bankB.calculateSimpleInterest();
                break;
            default:
                System.out.println("Invalid bank name entered.");
                return;
        }

        System.out.println("Simple Interest for Bank A: " + interestA);
        System.out.println("Simple Interest for Bank B: " + interestB);
    }
}
