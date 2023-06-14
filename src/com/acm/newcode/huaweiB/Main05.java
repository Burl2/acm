package com.acm.newcode.huaweiB;

import java.util.Scanner;

public class Main05 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String s = in.nextLine().replaceAll("," , "");
            String[] split = s.split("1");
            int maxLen = 0;
            for (int i=0;i<split.length;i++) {
                if (i==0 || i== split.length-1) {
                    maxLen = Math.max(maxLen,split[i].length());
                } else if (split[i].length() %2 == 1){
                    maxLen = Math.max(maxLen, split[i].length() /2 +1);
                } else {
                    maxLen = Math.max(maxLen,split[i].length() /2);
                }
            }
            System.out.println(maxLen);
        }
    }
}
//1,0,0,0,0,1,0,0,1,0,1