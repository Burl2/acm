package com.acm.newcode.huaweijishi;

import java.util.Scanner;

public class HJ1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s = in.nextLine();
            String[] split = s.split(" ");
            System.out.println(split[split.length-1].length());
        }
    }
}
