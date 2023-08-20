package com.acm.newcode.huaweijishi;

import java.util.Scanner;

public class HJ12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s = in.next();

            StringBuilder sb = new StringBuilder();
            for (int i=s.length()-1;i>=0;i--) {
                sb.append(s.charAt(i));
            }
            System.out.println(sb);
        }
    }
}
