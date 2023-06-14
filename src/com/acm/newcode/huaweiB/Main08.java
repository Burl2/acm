package com.acm.newcode.huaweiB;

import java.util.Scanner;

public class Main08 {

    private static final long[] jiamiArr = new long[51];


    public static void main(String[] args) {
        jiamiArr[0] = 1;
        jiamiArr[1] = 2;
        jiamiArr[2] = 4;
        for (int i=3;i<=50;i++) {
            jiamiArr[i] = jiamiArr[i-3] + jiamiArr[i-2] + jiamiArr[i-1];
        }

        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            int n = in.nextInt();
            String[] strArr = new String[n];
            for (int i=0;i<n;i++) {
                strArr[i] = in.next();
            }

            for (String str : strArr) {
                encrypt(str);
            }
        }
    }

    private static void encrypt(String str) {
        char[] chars = str.toCharArray();

        for (int i=0;i< chars.length;i++) {
            chars[i] = (char) ((chars[i] - 'a' +jiamiArr[i]) % 26 +'a');
            System.out.print(chars[i]);
        }
        System.out.println();
    }
}
