package com.example.demo;
import java.util.ArrayList;
import java.util.List;

class NumberClassifier {
    private List<Integer> multiplesOf2;
    private List<Integer> multiplesOf3;
    private List<Integer> others;

    public NumberClassifier() {
        multiplesOf2 = new ArrayList<>();
        multiplesOf3 = new ArrayList<>();
        others = new ArrayList<>();
    }

    public void classifyNumbers(int[] numbers) {
        for (int num : numbers) {
            if (num % 2 == 0) {
                multiplesOf2.add(num);
            } else if (num % 3 == 0) {
                multiplesOf3.add(num);
            } else {
                others.add(num);
            }
        }
    }

    public List<Integer> getMultiplesOf2() {
        return multiplesOf2;
    }

    public List<Integer> getMultiplesOf3() {
        return multiplesOf3;
    }

    public List<Integer> getOthers() {
        return others;
    }
}

 class Divisible {
    public static void main(String[] args) {
        int[] array = {1, 4, 6, 7, 3, 15, 17, 1, 4, 6};

        NumberClassifier classifier = new NumberClassifier();
        classifier.classifyNumbers(array);

        System.out.println("Multiples of 2: " + classifier.getMultiplesOf2());
        System.out.println("Multiples of 3: " + classifier.getMultiplesOf3());
        System.out.println("Others: " + classifier.getOthers());
    }
}
