package com.acm.leecode;

import java.util.Arrays;
import java.util.Scanner;

public class Main0121 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String s = in.nextLine();
            String[] split = s.split(" ");
            int[] ints = Arrays.stream(split).mapToInt(Integer::parseInt).toArray();
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
        public static int fun1_maxProfit(int[] prices) {

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



    //暴力解，超出leecode时间限制
    public int fun2_maxProfit(int[] prices) {

        int maxProfit = 0;
        for (int i=0;i<prices.length-1;i++) {
            for (int j=i+1;j<prices.length;j++) {
                maxProfit = Math.max(maxProfit,prices[j] - prices[i]);
            }
        }
        return maxProfit;
    }

    public int fun3_maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i=1;i<prices.length;i++) {
            minPrice = Math.min(minPrice,prices[i-1]);
            maxProfit = Math.max(maxProfit,prices[i] - minPrice);
        }
        return maxProfit;
    }
}


