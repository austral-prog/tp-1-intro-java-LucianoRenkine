package com.template;

import java.beans.PropertyEditorSupport;

public class App {

    // 1. Sum of Two Integers
    public int sum(int a, int b) {
        return a + b;
    }

    // 2. Check Even or Odd
    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    // 3. Maximum of Two Numbers
    public int max(int a, int b) {
        int maximum = a;
        if (b > a) {
            maximum = b;
        }
        return maximum;
    }

    // 4. Factorial of a Number
    public int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        else {
            return n * factorial(n - 1); // Recursividad
        }
    }

    // 5. Count Characters in a String
    public int countChars(String input) {
        return input.length();
    }

    // 6. Reverse a String
    public String reverse(String input) {
        char[] characters = input.toCharArray();
        int length = characters.length;
        char[] reversed = new char[length];
        for (int i = 0; i < length; i++) {
            reversed[i] = characters[length - 1 - i];
        }
        return new String(reversed);
    }

    // 7. Check Prime Number
    public boolean isPrime(int number) {
        if (number > 1) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    // 8. Find the Smallest Element in an Array
    public int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    // 9. Sum of Elements in an Array
    public int arraySum(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return sum;
    }

    // 10. Convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        return ((celsius * 9)/5)+32;
    }
}
