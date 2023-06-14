package com.acm.newcode.huawei;

import java.util.Scanner;
import java.util.TreeSet;

/*
*HJ80 整型数组合并
*
* 描述
题目标题：

将两个整型数组按照升序合并，并且过滤掉重复数组元素。
输出时相邻两数之间没有空格。



输入描述：
输入说明，按下列顺序输入：
1 输入第一个数组的个数
2 输入第一个数组的数值
3 输入第二个数组的个数
4 输入第二个数组的数值

输出描述：
输出合并之后的数组

示例1
输入：
3
1 2 5
4
-1 0 3 2
复制
输出：
-101235
* */
public class Main05 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            int n1 = in.nextInt();
            int[] arr1 = new int[n1];
            for (int i=0;i<n1;i++) {
                arr1[i] = in.nextInt();
            }
            int n2 = in.nextInt();
            int[] arr2 = new int[n2];
            for (int i=0;i<n2;i++) {
                arr2[i] = in.nextInt();
            }
            System.out.println(margin(arr1,arr2));
        }
    }

    private static String margin(int[] arr1, int[] arr2) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        StringBuilder sb = new StringBuilder();
        for (int i : arr1) {
            treeSet.add(i);
        }
        for (int i : arr2) {
            treeSet.add(i);
        }
        for (int i :treeSet) {
            sb.append(i);
        }
        return sb.toString();
    }
}
