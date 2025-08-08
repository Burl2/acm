package com.acm.leecode;

import java.util.Scanner;

/**
 * 最长回文子串
 */
public class Main0005 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

            String next = in.next();
        }
    }

    public String fun1_longestPalindrome(String s) {

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


    public  static String fun2_longestPalindrome(String s) {

        if (s.length() == 1) return s;

        int strLen = s.length();
        char[] chars = s.toCharArray();
        int maxLen = 0;
        int begin = 0;

        for (int i=0;i<strLen;i++) {
            int tempL1 = huaDongFun(chars,i,i);
            int tempL2 = huaDongFun(chars,i,i+1);
//            maxLen =Math.max(maxLen,Math.max(tempL1,tempL2));
//            begin = i - (maxLen-1) / 2;
            int tempMax = Math.max(tempL1,tempL2);
            if (tempMax > maxLen) {
                maxLen = tempMax;
                begin = i - (maxLen-1) / 2;
            }
        }
        return s.substring(begin,begin+maxLen);
    }

    private static int huaDongFun(char[] chars, int l, int r) {
        int tempMaxLength = 0;
        while (l>= 0 && r< chars.length) {
            if (chars[l] == chars[r]) {
                tempMaxLength = Math.max(tempMaxLength,r-l+1);
                l--;
                r++;
            } else break;
        }
        return tempMaxLength;
    }


    }


