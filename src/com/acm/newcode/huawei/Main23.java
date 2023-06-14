package com.acm.newcode.huawei;

import java.util.Scanner;

/*
* HJ71 字符串通配符
*
* 示例1
输入：
te?t*.*
txt12.xls
复制
输出：
false
复制
示例2
输入：
z
zz
复制
输出：
false
复制
示例3
* */

//测试用例没有全部通过
//TODO
public class Main23 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String toPeiStr = in.nextLine().toLowerCase();
            String inputStr = in.nextLine().toLowerCase();

            System.out.println(fun1(toPeiStr,inputStr,0,0));
        }
    }

    private static boolean fun1(String toPeiStr, String inputStr, int p1, int p2) {

        if (p1 == toPeiStr.length() && p2 == inputStr.length()) {
            return true;
        } else if (p1 == toPeiStr.length() || p2 == inputStr.length()) {
            return false;
        }
        if (toPeiStr.charAt(p1) == '?' || toPeiStr.charAt(p1) == inputStr.charAt(p2)) {
            return fun1(toPeiStr,inputStr,p1+1,p2+1);
        }else if (toPeiStr.charAt(p1) == '*' &&  (inputStr.charAt(p2) >= 'a' && inputStr.charAt(p2) <= 'z')
        || (inputStr.charAt(p2) >= '0' && inputStr.charAt(p2) <= '9')) {
            return fun1(toPeiStr,inputStr,p1,p2+1) || fun1(toPeiStr,inputStr,p1+1,p2+1);
        }else {
            return false;
        }
    }
}
