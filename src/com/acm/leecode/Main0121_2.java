package com.acm.leecode;

import java.util.Scanner;

public class Main0121_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

        }
    }

    //暴力解，超出leecode时间限制
    public int maxProfit(int[] prices) {

        int maxProfit = 0;
        for (int i=0;i<prices.length-1;i++) {
            for (int j=i+1;j<prices.length;j++) {
                maxProfit = Math.max(maxProfit,prices[j] - prices[i]);
            }
        }
        return maxProfit;
    }


    }


