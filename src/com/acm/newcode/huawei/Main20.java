package com.acm.newcode.huawei;

import java.util.Scanner;

/*
* HJ64 MP3光标位置
*
* 输入：
10
UUUU
复制
输出：
7 8 9 10
7
* */
public class Main20 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            int n = in.nextInt();
            String opp = in.next();

            fun1(n,opp);
        }
    }

    private static void fun1(int n, String opp) {
        int pageSize = 4;
        int currentNum = 1;
        int pageIndex = 1;

        if (n < pageSize) {
            pageSize = n;
        }
        for (char c : opp.toCharArray()) {
            if (c == 'U') {
                if (currentNum == 1) {
                    currentNum = n;
                    pageIndex = pageSize;
                } else {
                    currentNum--;
                    if (pageIndex != 1) {
                        pageIndex--;
                    }
                }
            }
            else {
                if (currentNum == n) {
                    currentNum = 1;
                    pageIndex = 1;
                } else {
                    currentNum++;
                    if (pageIndex != pageSize) {
                        pageIndex++;
                    }
                }
            }
        }

        int next = pageSize - pageIndex;
        int pre = pageIndex -1;
        String page = "";
        for (int i = pre;i>=1;i--) {
            page += currentNum-i + " ";
        }
        page += currentNum+" ";
        for (int i=1; i<=next;i++) {
            page += currentNum + i + " ";
        }
        String res = page.substring(0,page.length()-1);
        System.out.println(res);
        System.out.println(currentNum);
    }
}
