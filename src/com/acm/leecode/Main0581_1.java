package com.acm.leecode;

import java.util.Scanner;

public class Main0581_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

        }
    }

    public int findUnsortedSubarray(int[] nums) {

        int left =-1, right = -1;
        int partMax = Integer.MIN_VALUE;
        int partMin = Integer.MAX_VALUE;

        for (int i=0;i< nums.length;i++) {
            if (nums[i] >= partMax) {
                partMax = nums[i];
            } else {
                right = i;
            }
            if (nums[nums.length-1-i] <= partMin) {
                partMin = nums[nums.length-1-i];
            } else {
                left = nums.length-1-i;
            }
        }
        return right == -1 ? 0 : right-left+1;
    }



    }


