package com.acm.leecode;

import java.util.Scanner;

public class Main0034_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

        }
    }

    //二分查找，TODO 需要在做=没有思路
    public int[] searchRange(int[] nums, int target) {

        int left = binarySearch(nums,target,true);
        int right = binarySearch(nums,target,false)-1;

        if (left <= right && right < nums.length && nums[left] == target && nums[right] == target) {
            return new int[]{left,right};
        }
        return new int[]{-1,-1};
    }

    private int binarySearch(int[] nums, int target, boolean b) {
        int left = 0, right = nums.length -1;
        int res = nums.length;

        while (left <= right) {
            int mid = (left + right) /2;
            if (nums[mid] > target || (b && nums[mid] == target)) {
                right = mid -1;
                res = mid;
            } else {
                left = mid +1;
            }
        }
        return res;
    }


}


