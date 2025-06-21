package com.kirangs;

import java.util.Scanner;

public class SumOfFirstNNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println("Sum of First " + N + " numbers : " + nNumbersSum(N));
    }

    /*
    Time Complexity:O(N) due to the recursive calls made N times.
    Space Complexity:O(N) due to the call stack growing linearly with N in the recursive calls.
     */
    private static int nNumbersSum(int N) {
        if (N == 1) {
            return 1;
        }
        return N + nNumbersSum(N - 1);
    }


}
