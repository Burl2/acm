package com.acm.newcode.huawei;

import java.util.Scanner;

/*
* HJ55 挑7
*
* 输入：
20
复制
输出：
3
复制
说明：
输入20，1到20之间有关的数字包括7,14,17共3个。
* */
public class Main16 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            int n = in.nextInt();

            int res = 0;
            int k = n / 7;
            for (int i =17;i<=n;i++) {
                if (String.valueOf(i).contains("7") && i % 7 != 0) {
                    res++;
                }
            }
            res += k;
            System.out.println(res);
        }
    }
}
