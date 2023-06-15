package com.acm.newcode.huaweiB;

import java.util.Scanner;

public class Main12 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            int N = in.nextInt();

            int[] dp = new int[N + 3];
            dp[2] = 1;
            dp[3] = 1;
            dp[4] = 2;
            if (N > 4) {
                for (int k=5;k<=N;k++) {
                    dp[k] = Math.min(dp[k-2]+1, dp[k-3]+1);
                }
            }
            System.out.println(dp[N]);
        }
    }
}
