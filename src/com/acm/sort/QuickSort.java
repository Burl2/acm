package com.acm.sort;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


            int[] input = {3,5,7,2,65,52,82,456,2315};
//            int[] arr    = quickSort(input);
//            System.out.println(Arrays.toString(arr));


    }

    /*public static int[] quickSort(int[] arr) {
        int middle = 0;
        int left = 0;
        int right = arr.length-1;
        sort(arr,middle,left,right);
        return arr;

    }

    private static void sort(int[] arr, int middle, int left, int right) {
        if (left >=right) return;
        int l = left;
        int r = right;
        while (left<right) {
            if (arr[left] > arr[middle] ) {
                if(arr[right] < arr[middle]) {
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;

                }else {
                    right--;

                }
            } else {
                left++;
            }
            if (arr[right] < arr[middle] && left<right) {
                if (arr[left] > arr[middle]) {
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                } else {
                    left++;
                }
            }else {
                right--;
            }
        }
//        {3,2,7,5,65,52,82,456,2315};
        int temp = arr[middle];
        arr[middle] = arr[left];
        middle = left;
        arr[middle] = temp;
        sort(arr,0,l,middle-1);
        sort(arr,0,middle+1,r);
    }*/
}
