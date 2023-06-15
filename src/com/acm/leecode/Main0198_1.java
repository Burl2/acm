package com.acm.leecode;

import java.util.Scanner;

//DP
public class Main0198_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    }

    public int rob(int[] nums) {
        if (nums.length == 0) return 0;

        int N =  nums.length;
        int[] dp = new int[N + 1];
        dp[0] = 0;
        dp[1] = nums[0];

        for (int k=2;k<=N;k++) {
            dp[k] = Math.max(dp[k-1], dp[k-2] + nums[k-1]);
        }
        return dp[N];
    }


    }


