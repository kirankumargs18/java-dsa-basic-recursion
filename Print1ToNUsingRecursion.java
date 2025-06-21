package com.kirangs;

public class Print1ToNUsingRecursion {
    public static void main(String[] args) {
        print1ToN(5);
    }

    //Time : O(N)
    //Space : O(N) recursion stack
    private static void print1ToN(int n) {
        if (n == 0) {
            return;
        }
        print1ToN(n - 1);
        System.out.println(n);
    }

}
