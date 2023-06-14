package com.acm.newcode.huawei;

import java.util.Scanner;


/*
*HJ105 记负均正II
*
*
* 输入：
-13
-4
-7
复制
输出：
3
0.0
复制
示例2
输入：
-12
1
2
复制
输出：
1
1.5
* */
public class Main26 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int fuAmount = 0;
        int feifuAmount = 0;
        double sum = 0.0;
        while (in.hasNext()) {
            int num = in.nextInt();
            if (num <0) {
                fuAmount++;
            }else {
                feifuAmount++;
                sum += num;
            }
        }
        System.out.println(fuAmount);
        if (feifuAmount == 0) {
            System.out.println(0.0);
        }else {
            System.out.printf("%.1f\n", sum / feifuAmount);
        }
    }
}
