package com.acm.leecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main0015_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

        }
    }
/*
* 15. 三数之和
给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，同时还满足 nums[i] + nums[j] + nums[k] == 0 。请

你返回所有和为 0 且不重复的三元组。

注意：答案中不可以包含重复的三元组。
* */
    public List<List<Integer>> threeSum(int[] nums) {

        if (nums.length < 3) return null;

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i=0;i< nums.length;i++) {
            if (nums[i] > 0 ) {
                break;
            }
            if (i>0 && nums[i] == nums[i-1]) {
                continue;
            }
            int l = i+1;
            int r = nums.length-1;
            while (l<r) {
                if (nums[l] + nums[r] + nums[i] == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    res.add(list);
                    while (l<r && nums[l+1] == nums[l]) l++;
                    while (l<r && nums[r-1] == nums[r]) r--;
                    l++;
                    r--;
                } else if ( nums[l] + nums[r] < -nums[i]) {
                    while (l<r && nums[l+1] == nums[l]) l++;
                    l++;

                } else if (nums[l] + nums[r] > -nums[i]) {
                    while (l<r && nums[r-1] == nums[r]) r--;
                    r--;
                }
            }
        }
        return res;
    }


    }


