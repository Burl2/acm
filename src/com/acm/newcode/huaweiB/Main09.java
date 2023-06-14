package com.acm.newcode.huaweiB;

import java.util.Scanner;

public class Main09 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            int n = in.nextInt();
            int[][] celue = new int[n][3];
            for (int i=0;i<n;i++) {
                celue[i][0] = in.nextInt();
                celue[i][1] = in.nextInt();
                celue[i][2] = in.nextInt();
            }

            int minCost = Integer.MAX_VALUE;
            for (int i=0;i<3;i++) {
                minCost = Math.min(minCost, dfs(celue,i,0,0));
            }
            System.out.println(minCost);
        }
    }

    private static int dfs(int[][] celue, int index, int taskNum, int lejiCost) {
        if (taskNum == celue.length) {
            return lejiCost;
        }
        int[] resCost = celue[taskNum];
        int minCost = Integer.MAX_VALUE;
        for (int i=0;i<3;i++) {
            if (index != i) {
                minCost = Math.min(minCost, dfs(celue,i,taskNum+1,lejiCost+ resCost[i]));
            }
        }
        return minCost;
    }

}
