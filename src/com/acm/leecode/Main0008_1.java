package com.acm.leecode;

import java.util.Scanner;

public class Main0008_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

            String next = in.next();
            System.out.println(myAtoi(next));
        }
    }

//-2147483647
    public static int myAtoi(String s) {

        int length = s.length();
        char[] chars = s.toCharArray();
        int index = 0;

        while (index < length && chars[index] == ' ') {
            index++;
        }
        if (index == length) return 0;

        int sign = 1;
        if (chars[index] == '+') {
            index++;
        } else if (chars[index] == '-') {
            sign = -1;
            index++;
        }
        int res = 0;
        while (index < length) {
            if (chars[index] > '9' || chars[index] < '0') {
                break;
            }
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && chars[index] - '0' > Integer.MAX_VALUE % 10)) {
                res = Integer.MAX_VALUE;
                break;
            }
//            int temp = -(Integer.MIN_VALUE % 10);
            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && chars[index] - '0' > -(Integer.MIN_VALUE % 10))) {
                res = Integer.MIN_VALUE;
                break;
            }
            res = res * 10 + sign * (chars[index++] - '0');
        }
        return res;
    }
}

