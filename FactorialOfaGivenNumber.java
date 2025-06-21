package com.kirangs;

import java.util.Scanner;

public class FactorialOfaGivenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Factorial of  " + n + " is  : " + factorial(n));
    }

   /* Time Complexity:O(n) due to the recursive calls to calculate factorial.
    Space Complexity:O(n) due to the call stack from the recursive calls.*/
    private static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
