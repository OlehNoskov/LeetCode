package com.example.leetcode.tasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 3};
        int[] nums2 = new int[]{2};

        int[] nums3 = new int[]{1, 2};
        int[] nums4 = new int[]{3, 4};

        System.out.println(findMedianSortedArrays(nums1, nums2));
        System.out.println(findMedianSortedArrays(nums3, nums4));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> integersList = Arrays.stream(nums1).boxed().collect(Collectors.toCollection(LinkedList::new));
        integersList.addAll(Arrays.stream(nums2).boxed().toList());
        Collections.sort(integersList);

        double median;
        int size = nums1.length + nums2.length;

        if (size % 2 == 1) {
            median = (double) integersList.get(integersList.size() / 2);
        } else {
            int firstIndex = integersList.size() / 2 - 1;
            int secondIndex = integersList.size() / 2;
            median = (double) (integersList.get(firstIndex) + integersList.get(secondIndex)) / 2;
        }
        return median;
    }
}
