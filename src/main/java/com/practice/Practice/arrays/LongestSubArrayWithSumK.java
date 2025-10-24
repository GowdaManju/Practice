package com.practice.Practice.arrays;

public class LongestSubArrayWithSumK {
    public static void main(String[] args) {
        int arr[] = {1, 0, 2, 0, 1, 1, 1, 0, 1, 0, 1};
        int k = 3;

        int max_length = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    max_length = Math.max(max_length, j - i + 1);
                }
            }
        }

        System.out.println(max_length);  // Output: 6
    }


}
