package com.acm.leecode;

import java.util.Arrays;
import java.util.Scanner;

public class Main0581_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

        }
    }

    public int findUnsortedSubarray(int[] nums) {

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


