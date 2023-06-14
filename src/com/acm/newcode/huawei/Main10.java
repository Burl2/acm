package com.acm.newcode.huawei;

import java.util.Scanner;

/*
HJ32 密码截取

示例1
输入：
ABBA
复制
输出：
4
复制
示例2
输入：
ABBBA
复制
输出：
5
复制
示例3
输入：
12HHHHA
复制
输出：
4
* */
public class Main10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {
            String s = in.nextLine();
//            System.out.println(cal(s));
            System.out.println(cal2(s));
        }

    }

    //动态规划
    private static int cal2(String s) {
        int res = 0;
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        for (int i=0;i< len -1 ; i++) {
            dp[i][i] = true;
        }

        for (int r =1;r<len;r++) {
            for (int l =0; l < r; l++) {
                if (s.charAt(l) == s.charAt(r) && (r-l <= 2 || dp[l+1][r-1])) {
                    dp[l][r] = true;
                    res = Math.max(r-l+1,res);
                }
            }
        }
        return res;
    }

    private static int cal(String s) {
        int res = 0;
        for (int i=0;i<s.length();i++) {
            int len1 = longest(s,i,i);
            int len2 = longest(s,i,i+1);
            res = Math.max(res,(Math.max(len1, len2)));
        }
        return res;
    }

    private static int longest(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return r-l-1;
    }
}
