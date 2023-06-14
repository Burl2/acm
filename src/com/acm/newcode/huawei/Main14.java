package com.acm.newcode.huawei;

//import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/*
* HJ41 称砝码
*
* 对于每组测试数据：
第一行：n --- 砝码的种数(范围[1,10])
第二行：m1 m2 m3 ... mn --- 每种砝码的重量(范围[1,2000])
第三行：x1 x2 x3 .... xn --- 每种砝码对应的数量(范围[1,10])
输出描述：
利用给定的砝码可以称出的不同的重量数

示例1
输入：
2
1 2
2 1
复制
输出：
5
* */
public class Main14 {

//    TODO 动态规划思路，真他吗难
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int[] amount = new int[n];
            int[] weight = new int[n];

            for (int i=0;i<2*n;i++) {
                if (i<n) {
                    weight[i] = in.nextInt();
                }else {
                    amount[i-n] = in.nextInt();
                }
            }


        }
    }
}
