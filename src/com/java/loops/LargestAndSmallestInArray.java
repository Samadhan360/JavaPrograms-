package com.java.loops;

public class LargestAndSmallestInArray {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 20, 8, 15};
        
        int smallest = numbers[0];
        int largest = numbers[0];
        
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        
        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }
}

