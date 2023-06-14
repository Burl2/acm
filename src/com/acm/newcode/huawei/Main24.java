package com.acm.newcode.huawei;


import java.util.ArrayList;
import java.util.Scanner;

/*
*HJ92 在字符串中找出连续最长的数字串
*
*
* 输入：
abcd12345ed125ss123058789
a8a72a6a5yy98y65ee1r2
复制
输出：
123058789,9
729865,2
复制
说明：
样例一最长的数字子串为123058789，长度为9
样例二最长的数字子串有72,98,65，长度都为2
* */
public class Main24 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String s = in.next();

//            regex(s);
            dpFun(s);
        }
    }

    private static void dpFun(String s) {
        int length = s.length();
        int[] dp = new int[length + 1];
        int maxLength = 0;

        char[] arr = s.toCharArray();
        for (int i=1;i<=length;i++) {
            if (arr[i-1] >= '0' && arr[i-1] <= '9') {
                dp[i] = dp[i-1] + 1;
                maxLength = Math.max(dp[i],maxLength);
            }
        }
        for (int i=1;i<=length;i++) {
            if (dp[i] == maxLength) {
                System.out.print(s.substring(i-maxLength,i));
            }
        }
        System.out.println(","+ maxLength);
    }

    private static void regex(String s) {
        String[] str = s.split("[^0-9]+");
        ArrayList<String> list = new ArrayList<>();
        int maxLength = 0;
        for (String st : str) {
            if (st.length() > maxLength) {
                maxLength = st.length();
                list.clear();
                list.add(st);
            } else if (st.length() == maxLength) {
                list.add(st);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String st : list) {
            sb.append(st);
        }
        sb.append(","+maxLength);
        System.out.println(sb.toString());
    }
}
