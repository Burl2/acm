package com.acm.leecode;

import java.util.Arrays;
import java.util.Scanner;

public class Main0581 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

        }
    }

    public int fun1_findUnsortedSubarray(int[] nums) {

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

    public int fun2_findUnsortedSubarray(int[] nums) {

        int[] sortedNums = new int[nums.length];
        System.arraycopy(nums,0,sortedNums,0,nums.length);
        Arrays.sort(sortedNums);
        int left =0;
        int right = nums.length-1;
        while (left<nums.length && nums[left] == sortedNums[left]) {
            left++;
        }
        if (left == nums.length) return 0;
        while (right >=0 && nums[right] == sortedNums[right]) {
            right--;
        }
        return right-left+1;
    }


    }


