package com.acm.leecode;

import java.util.Scanner;

public class Main746_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

        }
    }

    public int minCostClimbingStairs(int[] cost) {

        int length = cost.length+1;
        int[] dp = new int[length];
        dp[0] = 0;
        dp[1] = 0;

        for (int i=2;i<=length;i++) {
            dp[i] = Math.min(dp[i-2] + cost[i-2], dp[i-1] + cost[i-1]);
        }

        return dp[length];
    }



    }


