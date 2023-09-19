package com.example.demo;

import java.util.Scanner;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

class InsuranceException extends Exception {
    public InsuranceException(String message) {
        super(message);
    }
}

class VotingService {
    public void checkVoterEligibility(int age, String gender) throws MyException, InsuranceException {
        if (age < 18) {
            throw new MyException("Not eligible for voting");
        }

        if (gender.equals("male")) {
            throw new MyException("Eligible for voting");
        } else if (gender.equals("female")) {
            throw new InsuranceException("Eligible for insurance");
        } else {
            System.out.println("Invalid gender");
        }
    }
}

public class CustomException {
    public static void main(String[] args) {
        System.out.println("Enter the voter's age:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Gender:");
        Scanner Ge = new Scanner(System.in);

        try {
            int age = sc.nextInt();
            String gender = Ge.next(); 

            VotingService votingService = new VotingService();
            votingService.checkVoterEligibility(age, gender);
        } catch (MyException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (InsuranceException e) {
            System.out.println("Insurance Exception: " + e.getMessage());
        }
    }
}
