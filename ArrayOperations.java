//package com.mycompany.arrayoperations;

import java.util.Scanner;

/**
 *
 * @author Group A
 */
public class ArrayOperations {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[15];

        // a) Taking 15 integer values as inputs from the user and storing them in the array
        System.out.println("Enter 15 integer values:");
        for (int i = 0; i < 15; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Print the values stored in the array
        System.out.println("The values stored in the array are:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();

        // b) Check if a user-entered number is present in the array
        System.out.print("Enter a number to check if it is in the array stored above: ");
        int numberToCheck = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToCheck) {
                System.out.println("The number found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("The Number you entered does not found in this array.");
        }

        // c) Create another array and copy elements in reverse order
        int[] reversedArray = new int[15];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }

        // Print the elements of the new array in reverse order
        System.out.println("Here are the Elements of the new array in reverse order:");
        for (int value : reversedArray) {
            System.out.print(value + " ");
        }
        System.out.println();

        // d) Get the sum and product of all elements in the array
        int sum = 0;
        long product = 1;
        for (int value : array) {
            sum += value;
            product *= value;
        }

        // Print the sum and product
        System.out.println("The Sum of all elements in the array is: " + sum);
        System.out.println("The Product of all elements in the array is: " + product);
    }
}
