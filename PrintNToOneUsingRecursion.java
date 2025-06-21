package com.kirangs;

public class PrintNToOneUsingRecursion {
    public static void main(String[] args) {
        printNtoOne(5);
    }


    private static void printNtoOne(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNtoOne(n - 1);
    }
}
