package com.acm.newcode.huawei;


import java.util.Scanner;

/*
* HJ57 高精度整数加法
*
* 输入：
9876543210
1234567890
复制
输出：
11111111100
* */
public class Main18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String s1 = in.next();
            String s2 = in.next();

            StringBuilder sb = new StringBuilder();
            int carry =0;
            int m = s1.length()-1;
            int n = s2.length() -1;
            while (m >=0 || n >=0) {
//                char sd = '3';
//                int value = Character.getNumericValue(sd);
                int n1 = m >= 0 ? Character.getNumericValue(s1.charAt(m--)) : 0;
                int n2 = n >= 0 ? Character.getNumericValue(s2.charAt(n--)) : 0;
                int nAdd = (n1 + n2 + carry) % 10;
                 carry = n1 + n2 + carry>=10 ? 1 : 0;
                 sb.append(nAdd);
            }
            if (carry == 1) sb.append(1);
            String res = sb.reverse().toString();
            System.out.println(res);
        }
    }
}
