package com.acm.newcode.huaweijishi;

import java.util.Scanner;

public class HJ2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s = in.nextLine().toLowerCase();
            char target = in.next().toLowerCase().charAt(0);

            int count = 0;
            for ( char c : s.toCharArray()) {
                if (c == target) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
