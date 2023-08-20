package com.acm.newcode.huaweijishi;

import java.util.Scanner;

public class HJ24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int N = in.nextInt();
            if (N <= 2) {
                System.out.println(0);
            }
            int[] ints = new int[N];
            for (int i=0;i<N;i++) {
                ints[i] = in.nextInt();
            }

            int[] left = new int[N];
            int[] right = new int[N];
            int maxLen = 2;
            left[0] = 1;
            right[N-1] = 1;

            for (int i=0;i<N;i++) {
                left[i] = 1;
                for (int j=0;j<i;j++) {
                    if (ints[i] > ints[j]) {
                        left[i] = Math.max(left[i], left[j] + 1);
                    }
                }
            }

            for (int i=N-1;i>=0;i--) {
                right[i] = 1;
                for (int j=N-1;j>i;j--) {
                    if (ints[i] > ints[j]) {
                        right[i] = Math.max(right[i], right[j] + 1);
                    }
                }
            }

            for (int i=0;i<N;i++) {
                maxLen = Math.max(maxLen, right[i] + left[i] -1);
            }
            System.out.println(N-maxLen);
        }
    }
}
