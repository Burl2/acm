package com.acm.newcode.huawei;


import java.util.ArrayList;
//import java.util.Comparator;
import java.util.Scanner;

/*
* HJ45 名字的漂亮度
*
* 示例1
输入：
2
zhangsan
lisi
复制
输出：
192
101
复制
说明：
对于样例lisi，让i的漂亮度为26，l的漂亮度为25，s的漂亮度为24，lisi的漂亮度为25+26+24+26=101.
* */
public class Main15 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            int n = in.nextInt();
            for (int i=0;i<n;i++) {
                String s = in.next();
                System.out.println(cal(s));
            }
        }
    }

    private static String cal(String s) {
        int[] arr = new int[26];
        for (char c : s.toCharArray()) {
            arr[(c - 'a')]++;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int n : arr) if (n != 0) list.add(n);
        list.sort((o1, o2) -> o2 - o1);

        int point =26;
        int res =0;
        for (int n : list) {
            res = res + n * point;
            point--;
        }
//        return res + "";
        return String.valueOf(res);
    }
}

