package com.kirangs;

import java.util.Scanner;

public class SumOFArrayElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements : ");
        for (int i = 0; i <= n - 1; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Sum : " + arraySum(arr));
    }

    /*Time Complexity:The time complexity is O(n) because the `sum` function makes 'n' recursive calls, where 'n' is the size of the input array. Each call performs a constant amount of work.
    Space Complexity:The space complexity is O(n) due to the recursive call stack. In the worst case, the depth of the recursion can be 'n', leading to 'n' function calls being stored on the stack.*/
    private static int arraySum(int[] nums) {
        return sum(nums, nums.length, 0);
    }

    private static int sum(int[] nums, int n, int i) {
        if (i >= n) {
            return 0;
        }
        return nums[i] + sum(nums, n, i + 1);
    }

}
