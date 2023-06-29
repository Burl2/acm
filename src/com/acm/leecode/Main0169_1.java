package com.acm.leecode;

import java.util.Scanner;

public class Main0169_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

        }
    }


    public int majorityElement(int[] nums) {

        int ans = nums[0];
        int count = 1;
        for (int i=1;i< nums.length;i++) {
            if (nums[i] == ans) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                ans = nums[i];
                count =1;
            }
        }
        return ans;
    }


    }


