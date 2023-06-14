package com.acm.newcode.string;

import java.util.Scanner;

/*
* 题解 | #查找两个字符串a,b中的最长公共子串#
发表于 2021-12-09 17:53
描述
题目描述

查找两个字符串a,b中的最长公共子串。若有多个，输出在较短串中最先出现的那个。

注：子串的定义：将一个字符串删去前缀和后缀（也可以不删）形成的字符串。请和“子序列”的概念分开！

示例
输入：
abcdefghijklmnop
abcsafjklmnopqrstuvw
输出：
jklmnop
知识点：字符串
* */
public class Main01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {
            String s1 = in.nextLine();
            String s2 = in.nextLine();
//            longString(s1,s2);

            longString2(s1,s2);
        }
    }

    //动态规划
    private static void longString2(String s1, String s2) {

        String str1 = s1.length() > s2.length() ?s2:s1;//短的
        String str2 = s1.length() > s2.length() ?s1:s2;

        int m = str1.length() +1;
        int n = str2.length() +1;

        int[][] dp = new int[m][n];

        int maxLen = 0;
        int end = 0;

        for (int i=1;i<m;i++) {
            for (int j=1;j<n;j++) {
                if (str1.charAt(i-1) == str2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] +1;
                    if (dp[i][j] > maxLen) {
                        maxLen = dp[i][j];
                        end = i;
                    }
                }
            }
        }
        System.out.println(str1.substring(end-maxLen,end));
    }

    private static void longString(String s1, String s2) {

        String lStr = s1.length() > s2.length() ?s1:s2;
        String sStr = s1.length() > s2.length() ?s2:s1;

        int maxLen = 0,start = 0;
        for (int i=0;i<sStr.length();i++) {
            if (sStr.length()-i <= maxLen) {
                break;
            }

            for (int k=sStr.length();k>i;k--) {
                if (lStr.contains(sStr.substring(i,k)) && maxLen < (k-i)) {
                    maxLen = k-i;
                    start = i;
                    break;
                }
            }

        }
        System.out.println(sStr.substring(start,start+maxLen));
    }
}
