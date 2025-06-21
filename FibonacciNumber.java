package com.kirangs;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = scanner.nextInt();
        System.out.println(n + "th fibonacci number is " + fib(n));
    }

    /*
    Time Complexity:The time complexity is O(2^n) due to the recursive calls forming a binary tree-like structure.
    Space Complexity:The space complexity is O(n) due to the maximum depth of the recursion stack.
     */
    private static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
