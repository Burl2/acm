package com.acm.leecode;

import java.util.Scanner;

public class Main1732_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

        }
    }


    public int largestAltitude(int[] gain) {

        int minHeight = 0;
        int curHeight = 0;
        for (int n : gain) {
            curHeight = curHeight + n;
            minHeight = Math.max(minHeight,curHeight);
        }
        return minHeight;
    }


    }


