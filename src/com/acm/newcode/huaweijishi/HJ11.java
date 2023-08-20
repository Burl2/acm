package com.acm.newcode.huaweijishi;

import java.util.Scanner;

public class HJ11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int num = in.nextInt();
            if (num == 0) {
                System.out.println(0);
                continue;
            }
//            System.out.println();
//            System.out.println(Integer.MAX_VALUE);
//            System.out.println(Integer.MIN_VALUE);
            StringBuilder sb = new StringBuilder();
            while (num != 0) {
                int t = num % 10;
                sb.append(t);
                num /= 10;
            }
            System.out.println(sb);
        }
    }
}
