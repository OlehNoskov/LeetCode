package com.example.leetcode.tasks;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums1 = new int[]{2, 7, 11, 15};
        int[] nums2 = new int[]{3, 2, 4};
        int[] nums3 = new int[]{3, 3};

        int target1 = 9;
        int target2 = 6;
        int target3 = 6;

        System.out.println(Arrays.toString(twoSum(nums1, target1)));
        System.out.println(Arrays.toString(twoSum(nums2, target2)));
        System.out.println(Arrays.toString(twoSum(nums3, target3)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int b = 0; b < nums.length; b++) {
                if (nums[i] + nums[b] == target && i != b) {
                    result[0] = i;
                    result[1] = b;
                    return result;
                }
            }
        }
        return result;
    }
}