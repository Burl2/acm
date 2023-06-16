package com.acm.leecode;

import java.util.Scanner;

public class Main0121_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

        }
    }


    public int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i=1;i<prices.length;i++) {
            minPrice = Math.min(minPrice,prices[i-1]);
            maxProfit = Math.max(maxProfit,prices[i] - minPrice);
        }
        return maxProfit;
    }


    }


