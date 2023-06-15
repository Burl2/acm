package com.acm.leecode;

import java.util.HashSet;
import java.util.Scanner;

public class Main0217_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    }

    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<Integer>();

        for (int i : nums) {
            set.add(i);
        }
        if (nums.length - set.size() == 0) {
            return false;
        }
        return true;
    }


    }


