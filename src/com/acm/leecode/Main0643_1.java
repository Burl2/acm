package com.acm.leecode;

import java.util.Scanner;

public class Main0643_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {


        }
    }



    public double findMaxAverage(int[] nums, int k) {

//        if (nums.length == k) {
//            int tempSum = 0;
//            for (int i : nums) {
//                tempSum += i;
//            }
//            return (double) tempSum /k;
//        }
        int left =0;
        int right = 0;
        int maxSum = -Integer.MAX_VALUE;
        int hudongSum = 0;
        while (right < nums.length) {
            hudongSum += nums[right++];

            if (right-left == k){
                maxSum = Math.max(maxSum,hudongSum);
                hudongSum -= nums[left++];
            }
        }
        return (double) maxSum/k;
    }

    }


