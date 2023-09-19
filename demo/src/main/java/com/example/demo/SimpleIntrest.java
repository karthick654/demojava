package com.example.demo;

import java.util.Scanner;

class RBI {
    double rateOfInterest() {
        return 0;
    }
}

class HDFC extends RBI {
    double rateOfInterest() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the principal value:");
        int principal = scan.nextInt();

        System.out.println("Enter the rate of interest:");
        double rate = scan.nextDouble();

        System.out.println("Enter the number of years:");
        double years = scan.nextDouble();

        double SI = ((principal * rate * years) / 100);
        System.out.println("HDFC: The calculated simple interest is: " + SI);

        return SI;
    }
}

class IOB extends RBI {
    double rateOfInterest() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the principal value:");
        int principal = scan.nextInt();

        System.out.println("Enter the rate of interest:");
        double rate = scan.nextDouble();

        System.out.println("Enter the number of years:");
        double years = scan.nextDouble();

        double SI = ((principal * rate * years) / 100);
        System.out.println("IOB: The calculated simple interest is: " + SI);

        return SI;
    }
}

public class SimpleIntrest {
    public static void main(String[] args) {
        HDFC obj1 = new HDFC();
        IOB obj2 = new IOB();

        double interestRate1 = obj1.rateOfInterest();
        double interestRate2 = obj2.rateOfInterest();
    }
}
