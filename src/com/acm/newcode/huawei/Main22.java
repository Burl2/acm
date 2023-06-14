package com.acm.newcode.huawei;

import java.util.Scanner;

/*
* HJ69 矩阵乘法
*
*
* 输入：
2
3
2
1 2 3
3 2 1
1 2
2 1
3 3
复制
输出：
14 13
10 11
复制
说明：
1 2 3
3 2 1
乘以
1 2
2 1
3 3
等于
14 13
10 11
* */
public class Main22 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            int[][] arr1 = new int[x][y];
            int[][] arr2 = new int[y][z];
            for (int i=0;i<x;i++) {
                for (int j =0; j<y;j++) {
                    arr1[i][j] = in.nextInt();
                }
            }
            for (int i=0;i<y;i++) {
                for (int j =0; j<z;j++) {
                    arr2[i][j] = in.nextInt();
                }
            }
            int[][] res = fun1(arr1,arr2);
            for (int i=0;i<x;i++) {
                for (int j =0; j<z;j++) {
                    System.out.print(res[i][j]+" ");
                }
                System.out.println();
            }
        }
    }

    private static int[][] fun1(int[][] arr1, int[][] arr2) {
        int x = arr1.length;
        int y = arr2.length;
        int z = arr2[0].length;
        int[][] res = new int[x][z];
        for (int i=0;i<x;i++) {
            for (int j=0;j<z;j++) {
                for (int k =0;k<y;k++) {
                    res[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return res;
    }
}
