package com.acm.newcode.huaweiB;

import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String s = in.nextLine();

            char[] charArray = s.toCharArray();
            int cha = 1;
            boolean flag = false;
            int maxLen = 0;
            for (int i=0;i<charArray.length;i++) {
                for (int j=charArray.length;j>i;j--) {
                    String tempStr = s.substring(i, j);
                    String replaceAll = tempStr.replaceAll("[a-zA-Z]+", "");
                    if (tempStr.length() - replaceAll.length() == cha && replaceAll.length() != 0) {
                        flag = true;
                        maxLen = Math.max(tempStr.length(),maxLen);
                    }
//                    else if (tempStr.length() - replaceAll.length() == 0 || replaceAll.length() == 0) {
//                    }
                }
            }
            if (flag) {
                System.out.println(maxLen);
            }else {
                System.out.println(-1);
            }
        }
    }
}
