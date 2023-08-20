package com.acm.newcode.huaweijishi;

import java.util.Scanner;

public class HJ4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s = in.next();

            if (s.length() == 0) System.out.println(s);
            int start = 0;
            while (true) {
                if (s.length() - start <= 8) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(s.substring(start));
                    for (int i=0;i<start+8-s.length();i++) {
                        sb.append(0);
                    }
                    System.out.println(sb);
                    break;
                }
                System.out.println(s.substring(start,start+8));
                start += 8;
            }
        }
    }
}
