package com.acm.newcode.huawei;

import java.util.Scanner;

public class Main17 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String s1 = in.next();
            String s2 = in.next();

            int[][] dp = new int[s1.length() + 1][s2.length() + 1];
            dp[0][0] = 0;

            for (int i = 1;i<dp.length;i++) {
                dp[i][0] = i;
            }
            for (int i = 1;i<dp[0].length;i++) {
                dp[0][i] = i;
            }

            for (int i =1;i< dp.length;i++) {
                for (int j =1;j < dp[0].length;j++) {
                    if (s1.charAt(i-1) == s2.charAt(j-1)) {
                        dp[i][j] = dp[i-1][j-1];
                    } else {
                        dp[i][j] = Math.min(dp[i-1][j-1]+1,Math.min(dp[i][j-1]+1,dp[i-1][j]+1));
                    }
                }
            }
            System.out.println(dp[s1.length()][s2.length()]);
        }
    }
}
