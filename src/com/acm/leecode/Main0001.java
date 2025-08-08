package com.acm.leecode;

public class Main0001 {

    public static void main(String[] args) {

    }

    public int[] fun1_twoSum(int[] nums, int target) {

        int[] res = new int[2];
        for(int i=0; i<nums.length; i++) {
            int first = nums[i];
            for(int j=i+1; j<nums.length; j++) {
                if(nums[j] == target - nums[i]) {
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }
}
