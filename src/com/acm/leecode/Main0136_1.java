package com.acm.leecode;

import java.util.Scanner;

public class Main0136_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

        }
    }

    public int singleNumber(int[] nums) {

        int ans = nums[0];
        if (nums.length > 1) {
            for (int i=1;i< nums.length;i++) {
                ans ^= nums[i];
            }
        }
        return ans;
    }



    }


