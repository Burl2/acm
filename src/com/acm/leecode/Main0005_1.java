package com.acm.leecode;

import java.util.Scanner;

public class Main0005_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

        }
    }

    //最长回文子串
    public String longestPalindrome(String s) {

        if (s.length() == 1) return s;

        int strLen = s.length();
        boolean[][] dp = new boolean[strLen][strLen];
        int maxLen = 0;
        int begin = 0;
        for (int i=0;i<strLen;i++) {
            dp[i][i] = true;
            maxLen = 1;
        }

        char[] chars = s.toCharArray();
        for (int j=1;j<strLen;j++) {
            for (int i = 0;i<j;i++) {
                if (chars[i] == chars[j] && (j-i < 2 || dp[i+1][j-1])) {
                    dp[i][j] = true;
                    if (j-i+1 > maxLen) {
                        maxLen = j-i+1;
                        begin = i;
                    }
                }
            }
        }
        return s.substring(begin,begin+maxLen);
    }



    }


