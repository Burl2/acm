package com.acm.leecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main0015_4 {

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
            int target = -nums[i];
            int third = nums.length-1;
            for (int second= i+1;second< nums.length-1;second++) {
                if (second != i+1 && nums[second] == nums[second-1]) continue;
                while (second< third && nums[second] + nums[third] > target) {
                    third--;
                }
                if (third == second) break;
                if(nums[second]+nums[third]==target){
                    List<Integer> list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[second]);
                    list.add(nums[third]);
                    ans.add(list);
                }
            }
        }
        return ans;
    }



    }


