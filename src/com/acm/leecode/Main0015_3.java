package com.acm.leecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main0015_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

        }
    }

    public List<List<Integer>> threeSum(int[] nums) {

        if (nums.length < 3) return null;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for (int i=0;i< nums.length-2;i++) {
            if (nums[i] > 0) break;
            if (i != 0 && nums[i] == nums[i-1]) continue;

            int left = i+1;
            int right = nums.length -1;
            int target = -nums[i];
            while (left < right) {
                if (nums[left] + nums[right] == target) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    while (left<right && nums[left] == nums[left+1]) left++;
                    while (left<right && nums[right] == nums[right-1]) right--;
                    left++;
                    right--;

                    ans.add(list);
                } else if (nums[left] + nums[right] < target) {
                    while (left<right && nums[left] == nums[left+1]) left++;
                    left++;
                } else {
                    while (left<right && nums[right] == nums[right-1]) right--;
                    right--;
                }
            }
        }
        return ans;
    }



    }


