package com.acm.leecode;

import java.util.Scanner;

public class Main0074_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

        }
    }


    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;
        int resRow = -1;

        if (matrix[0][n-1] >= target) {
            resRow = 0;
        }else {
            for (int i=1;i<m;i++) {
                if (matrix[i][n-1] >= target && matrix[i-1][n-1] < target) {
                    resRow = i;
                    break;
                }
            }
        }

        if (resRow < 0) return false;

        for (int i =0;i<n;i++) {
            if (matrix[resRow][i] == target) {
                return true;
            }
        }
        return false;
    }

    }


