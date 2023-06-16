package com.acm.leecode;

import java.util.Arrays;
import java.util.Scanner;

public class Main0088_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

            int[] nums1 = Arrays.stream(in.next().split(",")).mapToInt(Integer::parseInt).toArray();
            int m = in.nextInt();
            int[] nums2 = Arrays.stream(in.next().split(",")).mapToInt(Integer::parseInt).toArray();
            int n = in.nextInt();
            merge(nums1,m,nums2,n);
        }
    }


    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        if (m==0) nums1 = nums2;

        for (int i=m-1, index=0;i<m+n-1;i++,index++) {
            nums1[i+1] = nums2[index];
        }
        Arrays.sort(nums1);
        System.out.println(nums1);
        System.out.println(Arrays.toString(nums1));
    }

    }


/*测试用例 ide可成功，Leecode返回错误，不知道什么原因
0
0
1
1
* */