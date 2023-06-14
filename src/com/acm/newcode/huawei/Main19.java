package com.acm.newcode.huawei;

import java.util.Scanner;

/*
* HJ63 DNA序列
*
* 示例1
输入：
ACGT
2
复制
输出：
CG
复制
说明：
ACGT长度为2的子串有AC,CG,GT3个，其中AC和GT2个的GC-Ratio都为0.5，CG为1，故输出CG
示例2
输入：
AACTGTGCACGACCTGA
5
复制
输出：
GCACG
复制
说明：
虽然CGACC的GC-Ratio也是最高，但它是从左往右找到的GC-Ratio最高的第2个子串，所以只能输出GCACG。
* */
public class Main19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String s = in.next();
            int n = in.nextInt();
//            System.out.println(fun1(s,n));
//            System.out.println(fun2(s,n));
            System.out.println(fun3(s,n));
        }
    }

    private static String fun3(String s, int n) {
        int start = 0;
        int max = 0;
        int left = 0;
        int right = 0;
        int count = 0;

        while (right < s.length()) {
            char c = s.charAt(right++);
            if (c == 'C' || c == 'G') {
                count ++;
            }
            if (count > max) {
                max = count;
                start = left;
                if (count == n) {
                    return s.substring(start,start+n);
                }
            }
            if (right - left >= n) {
                char d = s.charAt(left++);
                if (d == 'C' || d == 'G') {
                    count--;
                }
            }
        }
        return s.substring(start,start + n);
    }

    private static String fun2(String s, int n) {
        String res = "";
        int max = 0;
        for (int i=0; i < s.length() -n + 1; i++) {
            int tempAmount =0;
            for (int j=i; j<i+n;j++) {
                if (s.charAt(j) == 'C' || s.charAt(j) == 'G') {
                    tempAmount++;
                }
            }
            if (tempAmount > max) {
                max = tempAmount;
                res = s.substring(i,i+n);
                if (tempAmount == n) {
                    return res;
                }
            }
        }
        return res;
    }

    private static String fun1(String s, int n) {
        String res = "";
        int maxCGAmount = 0;
        for (int i=0;i < s.length() - n +1;i++) {
            String tempStr = s.substring(i,i+n);
            int CGAmount = tempStr.replaceAll("[^CG]","").length();
            if (CGAmount > maxCGAmount) {
                maxCGAmount = CGAmount;
                res = tempStr;
            }
        }
        return res;
    }
}
