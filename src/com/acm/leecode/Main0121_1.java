package com.acm.leecode;

import java.util.Arrays;
import java.util.Scanner;

public class Main0121_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String s = in.nextLine();
            String[] split = s.split(" ");
            int[] ints = Arrays.stream(split).mapToInt(Integer::parseInt).toArray();
            int res = maxProfit(ints);
            System.out.println(res);
        }


    }

//    public static int maxProfit(int[] prices) {

        /*
        int[] dp = new int[prices.length + 1];
        dp[0] = 0;
        dp[1] = 0;
        int minBuy = Integer.MAX_VALUE;
        for (int i =2;i<=prices.length;i++) {
            for (int j=0;j<i-1;j++) {
                minBuy = Math.min(prices[j],minBuy);
            }
            int profit = prices[i-1] - minBuy;
            dp[i] = Math.max(dp[i-1],profit);
        }

        return dp[prices.length];

         */
//    }
        public static int maxProfit(int[] prices) {

            int[] dp = new int[prices.length + 1];
            dp[0] = 0;
            dp[1] = 0;
            int minBuy = prices[0];
            for (int i =2;i<=prices.length;i++) {

                int profit = prices[i-1] - minBuy;
                dp[i] = Math.max(dp[i-1],profit);
                minBuy = Math.min(minBuy,prices[i-1]);
            }

            return dp[prices.length];
        }


    }


