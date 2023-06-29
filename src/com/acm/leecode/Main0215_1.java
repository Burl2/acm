package com.acm.leecode;

import java.util.Random;
import java.util.Scanner;

public class Main0215_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

        }
    }

    Random random = new Random();
    public int findKthLargest(int[] nums, int k) {
        return quickSortSelect(nums,0,nums.length-1, nums.length-k);
    }

    private int quickSortSelect(int[] nums, int l, int r, int targetIndex) {
        int confirmIndex = randomPartition(nums,l,r);
        if (confirmIndex == targetIndex) {
            return nums[confirmIndex];
        } else {
            return confirmIndex > targetIndex ?
                    quickSortSelect(nums,l,confirmIndex-1,targetIndex) : quickSortSelect(nums,confirmIndex+1,r,targetIndex);
        }
    }

    private int randomPartition(int[] nums, int l, int r) {
        int middle = random.nextInt(r - l + 1) + l;
        swap(nums,middle,r);
        return partition(nums,l,r);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private int partition(int[] nums, int l, int r) {
        int x = nums[r];
        int gt = l-1;
        for (int i =l;i<r;i++) {
            if (nums[i] <= x) {
                swap(nums,++gt,i);
            }
        }
        swap(nums,gt+1,r);
        return gt+1;
    }


}


