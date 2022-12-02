package com.example.leetcode.tasks;

import java.util.*;

public class LongestSubstring {

    public static void main(String[] args) {
        String testString1 = "abcabcbb";
        String testString2 = "bbbbb";
        String testString3 = "pwwkew";
        String testString4 = " ";
        String testString5 = "";

        System.out.println(lengthOfLongestSubstring(testString1));
        System.out.println(lengthOfLongestSubstring(testString2));
        System.out.println(lengthOfLongestSubstring(testString3));
        System.out.println(lengthOfLongestSubstring(testString4));
        System.out.println(lengthOfLongestSubstring(testString5));
    }

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();

        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (checkRepetition(s, i, j)) {
                    res = Math.max(res, j - i + 1);
                }
            }
        }
        return res;
    }

    private static boolean checkRepetition(String s, int start, int end) {
        Set<Character> chars = new HashSet<>();

        for (int i = start; i <= end; i++) {
            char c = s.charAt(i);
            if (chars.contains(c)) {
                return false;
            }
            chars.add(c);
        }
        return true;
    }
}