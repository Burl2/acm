package com.acm.leecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main0015 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

        }
    }

    public List<List<Integer>> fun1_threeSum(int[] nums) {

        ArrayList<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length<3) return res;

        Arrays.sort(nums);

        for (int i=0;i< nums.length-2;i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i-1] == nums[i]) continue;
            int l = i+1;
            int r = nums.length-1;
            int target = -nums[i];
            while (l < r) {
//                if (nums[l] + nums[r] < target) l++;
//                if (nums[l] + nums[r] > target) r--;
                if (nums[l] + nums[r] < target) {
                    l++;
                } else if (nums[l] + nums[r] > target) {
                    r--;
                }
                else if (nums[l] + nums[r] == target) {
                    ArrayList<Integer> integerArrayList = new ArrayList<>();
                    integerArrayList.add(nums[l]);
                    integerArrayList.add(nums[r]);
                    integerArrayList.add(nums[i]);
                    res.add(integerArrayList);
                    while (l<r && nums[l] == nums[l+1]) l++;
                    while (l<r && nums[r] == nums[r-1]) r--;
                    l++;
                    r--;
                }
            }
        }
        return res;
    }

    public List<List<Integer>> fun2_threeSum(int[] nums) {

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

    public List<List<Integer>> fun3_threeSum(int[] nums) {

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

    public List<List<Integer>> fun4_threeSum(int[] nums) {

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


