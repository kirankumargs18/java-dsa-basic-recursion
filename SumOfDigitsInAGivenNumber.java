package com.kirangs;

import java.util.Scanner;

public class SumOfDigitsInAGivenNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scanner.nextInt();
        System.out.println("sum of the digits of " + num + " is " + addDigits(num));
    }

    /*
    Time Complexity O(log n) – This is because each recursive call processes a number with fewer digits than the previous call,
    leading to logarithmic time complexity in terms of the number of digits.

    SpaceComplexity O(log n) – This space is required for the recursion stack,
    which grows with the number of digits in the number.
     */
    private static int addDigits(int num) {
        if (num < 10) {
            return num;
        }
        return digitSum(sum(num));
    }

    private static int digitSum(int num) {
        int sum = sum(num);
        if (sum < 10) {
            return sum;
        }
        return digitSum(sum);
    }

    private static int sum(int num) {
        if (num == 0) {
            return 0;
        }
        return (num % 10) + sum(num / 10);
    }
}
