package com.acm.leecode;

import java.util.Scanner;

public class Main0338_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

        }
    }


    public int[] countBits(int n) {

        int[] res = new int[n + 1];

        for (int i=0;i<=n;i++) {
            int count = 0;
            while (i != 0) {
                i = i & (i-1);
                count++;
            }
            res[i] = count;
        }
        return res;
    }


    }


