package com.acm.newcode.huaweijishi;

import java.util.Scanner;

public class HJ22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int count = in.nextInt();

            if (count != 0) {
                System.out.println(count / 2);
            } else break;
        }
    }
}
