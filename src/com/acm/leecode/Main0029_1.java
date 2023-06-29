package com.acm.leecode;

import java.util.Scanner;

public class Main0029_1 {
/*
-2147483648
        -1
        */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int i = in.nextInt();
            int i1 = in.nextInt();
            System.out.println(divide(i,i1));
        }
    }


    public static int divide(int dividend, int divisor) {

        if (divisor == 0 || dividend == 0) return 0;

        int flag1 = 1;
        int flag2 = 1;

        if (dividend < 0) {
            dividend = -dividend;
            flag1 = -1;
        }
        if (divisor < 0) {
            divisor = -divisor;
            flag2 = -1;
        }
        int ans = -1;
        int sum = 0;
        while (sum <= dividend) {
            sum += divisor;
            ans++;
        }
        if (flag1 + flag2 == 0) {
            return -ans;
        } else return ans;
    }


    }


