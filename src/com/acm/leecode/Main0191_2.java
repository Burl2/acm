package com.acm.leecode;

import java.util.Scanner;

public class Main0191_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

        }
    }

    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {

        int count = 0;
        while (n != 0) {
            n &= n-1;
            count++;
        }
        return count;
    }



    }


