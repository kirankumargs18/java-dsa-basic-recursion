package com.kirangs;

import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements : ");
        for (int i = 0; i <= n - 1; i++) {
            nums[i] = scanner.nextInt();
        }
        int[] reverseArray = reverseArray(nums);
        for (int i = 0; i <= reverseArray.length - 1; i++) {
            System.out.print(reverseArray[i] + " ");
        }
    }

    /*
    Time Complexity:O(n) due to the recursive calls that effectively iterate through half of the array.
    Space Complexity:O(n) due to the recursion depth, where n is the number of elements in the input array.
     */
    private static int[] reverseArray(int[] nums) {
        int begin = 0;
        int end = nums.length - 1;
        return reverse(nums, begin, end);
    }

    private static int[] reverse(int[] nums, int begin, int end) {
        if (begin >= end) {
            return nums;
        }
        swap(nums, begin, end);
        return reverse(nums, begin + 1, end - 1);
    }

    private static void swap(int[] nums, int begin, int end) {
        int temp = nums[begin];
        nums[begin] = nums[end];
        nums[end] = temp;
    }
}
