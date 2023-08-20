package com.acm.newcode.huaweijishi;

import java.util.Scanner;

public class HJ7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            double num = in.nextDouble();

            System.out.println((int)(num + 0.5));
        }
    }
}
