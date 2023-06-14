package com.acm.newcode.recursion;


import java.util.Scanner;

/*
* HJ108 求最小公倍数
* 描述
正整数A和正整数B 的最小公倍数是指 能被A和B整除的最小的正整数值，设计一个算法，求输入A和B的最小公倍数。

数据范围：1 \le a,b \le 100000 \1≤a,b≤100000
输入描述：
输入两个正整数A和B。

输出描述：
输出A和B的最小公倍数。

示例1
输入：
5 7
输出：
35
示例2
输入：
2 4
输出：
4
* */
public class Main01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = a;
//            int res = minNum(a,b,c);
            int res = minNum2(a,b);
            System.out.println(res);
        }
    }

    private static int minNum2(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        for(int i =1;i<b;i++) {
            if (a*i %b == 0) {
                return a*i;
            }
        }
        return a*b;
    }

    private static int minNum(int a, int b, int c) {
        if (a == 0 || b == 0) {
            return 0;
        }
        if (a % b == 0) {
            return a;
        }
        return minNum(a+c,b,c);
    }
}
