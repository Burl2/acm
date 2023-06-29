package com.acm.leecode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main0448_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

        }
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> ans = new ArrayList<>();

        int length = nums.length;
        for (int n : nums) {
            nums[(n-1)%length] += length;
        }
        for (int i=0;i<length;i++) {
            if (nums[i] <= length) {
                ans.add(i+1);
            }
        }
        return ans;
    }



    }


