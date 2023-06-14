package com.acm.newcode.huaweiB;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine(); // 输入虚拟IPv4地址字符串
        int p1, p2, p3, p4;
        String[] parts = ip.split("#");
        p1 = Integer.parseInt(parts[0]);
        p2 = Integer.parseInt(parts[1]);
        p3 = Integer.parseInt(parts[2]);
        p4 = Integer.parseInt(parts[3]); // 解析字符串为四个整数
        if (p1 >= 1 && p1 <= 128 && p2 >= 0 && p2 <= 255 && p3 >= 0 && p3 <= 255 && p4 >= 0 && p4 <= 255) {
            // 判断是否为合法的虚拟IPv4地址
//            String res = "";
//            int[] arr = {p1, p2, p3, p4};
//            for (int i = 0; i < 4; i++) {
//                String hex = Integer.toHexString(arr[i]).toUpperCase();
//                if (hex.length() == 1) {
//                    hex = "0" + hex;
//                }
//                res += hex;
//            }
//            System.out.println(Integer.parseInt(res, 16)); // 将16进制字符串转换为整数并输出
            long res = 0;
            int[] arr = {p1, p2, p3, p4};
            for (int n : arr) {
                res = res *256 + n;
            }
            System.out.println(res);
        } else {
            System.out.println("invalid IP");
        }
    }
}


//10#0#3#193