package com.acm.leecode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main2215_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

            StringBuilder sb = new StringBuilder();

        }
    }


    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<List<Integer>> resList = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int i : nums1) {
            set1.add(i);
        }
        for (int i: nums2) {
            set2.add(i);
        }
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i : nums1) {
            if (set2.add(i)) {
                list1.add(i);
            }
        }
        for (int i : nums2) {
            if (set1.add(i)) {
                list2.add(i);
            }
        }
        resList.add(list1);
        resList.add(list2);
        return resList;
    }


    }


