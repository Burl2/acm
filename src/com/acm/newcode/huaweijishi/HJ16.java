package com.acm.newcode.huaweijishi;

import java.util.Scanner;

public class HJ16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int money = in.nextInt();
            int N = in.nextInt();
            Goods[] goods = new Goods[N + 1];
            for (int i=1;i<=N;i++) {
                int v = in.nextInt();
                int p = in.nextInt();
                int q = in.nextInt();
                goods[i] = new Goods(v, p, q);
/*
                if (q != 0) {
                    if (goods[q].a1 == 0) {
                        goods[q].setA1(i);
                    } else {
                        goods[q].setA2(i);
                    }
                }
*/
            }
            for (int i=1;i<=N;i++) {
                if (goods[i].q != 0) {
                    if (goods[goods[i].q].a1 == 0) {
                        goods[goods[i].q].setA1(i);
                    } else {
                        goods[goods[i].q].setA2(i);
                    }
                }
            }

            int[][] dp = new int[N + 1][money + 1];
            for (int i=1;i<=N;i++) {
                int v, v1=0, v2=0, v3=0, temp, temp1=0, temp2=0, temp3=0;

                v=goods[i].v;
                temp = v * goods[i].p;

                if (goods[i].a1 != 0) {
                    v1 = v + goods[goods[i].a1].v;
                    temp1 = temp + goods[goods[i].a1].v * goods[goods[i].a1].p;
                }
                if (goods[i].a2 != 0) {
                    v2 = v + goods[goods[i].a2].v;
                    temp2 = temp + goods[goods[i].a2].p * goods[goods[i].a2].v;
                }
                if (goods[i].a1 != 0 && goods[i].a2 != 0) {
                    v3 = v + goods[goods[i].a1].v + goods[goods[i].a2].v;
                    temp3 = temp + goods[goods[i].a1].v * goods[goods[i].a1].p + goods[goods[i].a2].v * goods[goods[i].a2].p;
                }

                for (int j=1;j<=money;j++) {
                    if (goods[i].q != 0) {
                        dp[i][j] = dp[i-1][j];
                    } else {
                        dp[i][j] = dp[i-1][j];
                        if (j >= v && v!=0) dp[i][j] = Math.max(dp[i][j], dp[i-1][j-v] + temp);
                        if (j >= v1 && v1 != 0) dp[i][j] = Math.max(dp[i][j], dp[i-1][j-v1] + temp1);
                        if (j >= v2 && v2 != 0) dp[i][j] = Math.max(dp[i][j], dp[i-1][j-v2] + temp2);
                        if (j >= v3 && v3 != 0) dp[i][j] = Math.max(dp[i][j], dp[i-1][j-v3] + temp3);
                    }
                }
            }
            System.out.println(dp[N][money]);
        }
    }

    private static class Goods {
        int v;
        int p;
        int q;
        int a1=0;
        int a2=0;

        Goods(int v, int p, int q) {
            this.v = v;
            this.p = p;
            this.q = q;
        }

        public void setA1(int a1) {
            this.a1 = a1;
        }

        public void setA2(int a2) {
            this.a2 = a2;
        }
    }
}
