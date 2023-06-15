package com.acm.leecode;

import java.util.Scanner;

public class Main0042_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    }

    public int trap(int[] height) {

        int sum = 0;
        for (int i=1;i<height.length-1;i++) {
            int currentHeight = height[i];
            int leftMAXHeight = 0;
            int rightMAXHeight = 0;

            for (int j=i-1;j>=0;j--) {
                leftMAXHeight = Math.max(leftMAXHeight,height[j]);
            }
            for (int k=i+1;k<height.length;k++) {
                rightMAXHeight = Math.max(rightMAXHeight,height[k]);
            }
            int smallHeight = Math.min(leftMAXHeight,rightMAXHeight);
            if (smallHeight <= currentHeight) continue;
            if (smallHeight > currentHeight) {
                sum = sum + smallHeight - currentHeight;
            }
        }
        return sum;
    }
}
