package com.acm.customer;

import java.util.Scanner;

public class Main04 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

            String s1 = in.next();
            String s2 = in.next();

            String shortStr = s1.length() > s2.length() ? s2 : s1;
            String longStr = s1.length() > s2.length() ? s1 : s2;

            String sStr = new StringBuilder(shortStr).reverse().toString();
            String lStr = new StringBuilder(longStr).reverse().toString();
            int carry =0;
            StringBuilder res = new StringBuilder();
            int sum = 0;
            for(int i=0;i<sStr.length();i++) {
                sum = sStr.charAt(i)-'0' + lStr.charAt(i) - '0' + carry;
                carry = sum / 10;

                res.append((char) (sum % 10 + '0'));
            }
            for (int i=sStr.length();i<lStr.length();i++) {
                sum = lStr.charAt(i) - '0' + carry;
                carry = sum / 10;
                res.append((char) (sum % 10 + '0'));
            }
            if (carry != 0) res.append(1);
            System.out.println(res.reverse().toString());
        }
    }
}
