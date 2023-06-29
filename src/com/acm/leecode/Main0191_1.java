package com.acm.leecode;

import java.util.Scanner;

public class Main0191_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

        }
    }

    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {

        int count = 0;
        for (int i=0;i<32;i++) {
            if ((n & (1 << i)) == 1) {
                count++;
            }
        }
        return count;
    }



    }


