package com.kirangs;

import java.util.Scanner;
import java.util.Vector;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string : ");
        String input = scanner.nextLine();
        char[] charArray = input.toCharArray();
        Vector<Character> s = new Vector<>(charArray.length);
        for (char c : charArray) {
            s.add(c);
        }
        System.out.println(s);
        reverseString(s);
        System.out.println(s);
    }

    /*
    Time Complexity:O(n) due to the recursive calls that iterate through approximately half of the input vector, where n is the size of the vector.
    Space Complexity:O(n) due to the recursive call stack. In the worst case, the recursion depth can be n/2, leading to O(n) space complexity.
     */
    private static Vector<Character> reverseString(Vector<Character> s) {
        return reverse(s, 0, s.size() - 1);
    }

    private static Vector<Character> reverse(Vector<Character> s, int begin, int end) {
        if (begin >= end) {
            return s;
        }
        swap(s, begin, end);
        return reverse(s, begin + 1, end - 1);
    }

    private static void swap(Vector<Character> s, int begin, int end) {
        char temp = s.get(begin);
        s.set(begin, s.get(end));
        s.set(end, temp);
    }
}
