package com.kirangs;

import java.util.ArrayList;
import java.util.Scanner;

public class IsArraySorted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = scanner.nextInt();
        ArrayList<Integer> nums = new ArrayList<>(n);
        System.out.println("Enter " + n + " elements : ");
        for (int i = 0; i <= n - 1; i++) {
            nums.add(scanner.nextInt());
        }
        System.out.println("Is array sorted : " + isSorted(nums));
    }

    /*
    Time Complexity:O(n), where n is the size of the input ArrayList because the isArraySorted method recursively iterates through the ArrayList at most n-1 times.
    Space Complexity:O(n), due to the recursive call stack. In the worst case, if the array is sorted in descending order, the isArraySorted method will be called n times, leading to a call stack of size n.
     */
    private static boolean isSorted(ArrayList<Integer> nums) {
        if (nums.size() == 1) {
            return true;
        }
        return isArraySorted(0, nums);
    }

    private static boolean isArraySorted(int i, ArrayList<Integer> nums) {
        if (i > nums.size() - 2) {
            return true;
        }
        if (nums.get(i) > nums.get(i + 1)) {
            return false;
        }
        return isArraySorted(i + 1, nums);
    }
}
