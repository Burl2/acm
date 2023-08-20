package com.acm.newcode.huaweijishi;

import java.util.Scanner;

public class HJ15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int num = in.nextInt();

            int count = 0;
            for (int i=0;i<31;i++) {
                if ((num & (int)Math.pow(2, i) ) != 0) count++;
            }
            System.out.println(count);
        }
    }
}
