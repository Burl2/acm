package com.acm.newcode.huawei;

import java.util.Scanner;

/*
*
* HJ33 整数与IP地址间的转换
*
*
* 示例1
输入：
10.0.3.193
167969729
复制
输出：
167773121
10.3.3.193
* */
public class Main11 {
    private static int N = 4;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String s = in.nextLine();
            System.out.println(convert(s));
        }
    }

    private static String convert(String s) {
        if (s.contains(".")) {
            String[] arr = s.split("\\.");
            long result =0;
            for (int i =0; i < N; i++) {
                result = result*256 + Integer.parseInt(arr[i]);
            }
            return result + "";
        } else {
            long ipv4 = Long.parseLong(s);
            String result = "";
            for (int i=0; i < N; i++) {
                result = ipv4%256 + "." + result;
                ipv4 /= 256;
            }
            return result.substring(0,result.length()-1);
        }
    }
}
