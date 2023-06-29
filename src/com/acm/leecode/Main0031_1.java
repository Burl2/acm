package com.acm.leecode;

import java.util.Scanner;

public class Main0031_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

        }
    }

    public static void nextPermutation(int[] nums) {

        int firstSmall = nums.length-2;
        while (firstSmall >= 0 && nums[firstSmall] >= nums[firstSmall +1]) {
            firstSmall--;
        }
        if (firstSmall >= 0) {
            int firstBig = nums.length-1;
            while (firstBig >=0 && nums[firstBig] <= nums[firstSmall]) {
                firstBig--;
            }
            swap(nums,firstSmall,firstBig);
        }
        reverse(nums,firstSmall+1);
    }

    private static void reverse(int[] nums, int start) {
        int left = start, right = nums.length-1;
        while (left < right) {
            swap(nums,left++,right--);
        }
    }

    private static void swap(int[] nums, int i1, int i2) {
        int temp = nums[i1];
        nums[i1] = nums[i2];
        nums[i2] = temp;
    }


}


