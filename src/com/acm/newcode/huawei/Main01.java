package com.acm.newcode.huawei;


import java.sql.SQLOutput;
import java.util.Scanner;

/*
*HJ96 表示数字
* 描述
将一个字符串中所有的整数前后加上符号“*”，其他字符保持不变。连续的数字视为一个整数。


数据范围：字符串长度满足 1 \le n \le 100 \1≤n≤100
输入描述：
输入一个字符串

输出描述：
字符中所有出现的数字前后加上符号“*”，其他字符保持不变

示例1
输入：
Jkdi234klowe90a3
复制
输出：
Jkdi*234*klowe*90*a*3*
* */
public class Main01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {
            String s = in.nextLine();

            StringBuilder builder = new StringBuilder();
            for (int i=0;i<s.length();) {
                if (s.charAt(i) >= '0' && s.charAt(i) <= '9' ) {
                    builder.append('*');
                    while (i<s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                        builder.append(s.charAt(i++));
                    }
                    builder.append('*');
                }else {
                    builder.append(s.charAt(i++));
                }
            }
            System.out.println(builder.toString());
        }
    }
}
