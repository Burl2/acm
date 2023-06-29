package com.acm.leecode;

import java.util.Scanner;

public class Main0740_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

        }
    }

    public int deleteAndEarn(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        }


        int maxVal = 0;
        for (int n : nums) {
            maxVal = Math.max(n,maxVal);
        }
        int[] dp = new int[maxVal + 1];
        int[] numberAmount = new int[maxVal + 1];
        for (int n :nums) {
            numberAmount[n]++;
        }
        if (maxVal == 1) {
            return numberAmount[1];
        }
        dp[1] = numberAmount[1];
        dp[2] = numberAmount[2] * 2;
        for (int i=2;i<=maxVal;i++) {
            dp[i] = Math.max(dp[i-2] + numberAmount[i] * i, dp[i-1]);
        }
        return dp[maxVal];
    }



    }


