package com.acm.newcode.huaweijishi;

import java.util.Scanner;

public class HJ13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s = in.nextLine();

            String[] split = s.split(" ");
            for (int i= split.length-1;i>0;i--) {
                System.out.print(split[i] + " ");
            }
            System.out.println(split[0]);
        }
    }
}
