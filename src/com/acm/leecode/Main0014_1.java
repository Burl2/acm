package com.acm.leecode;

import java.util.Scanner;

public class Main0014_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

        }
    }

    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) return "";

        for (int i=0;i<strs[0].length();i++) {
            char c = strs[0].charAt(i);
            for (int j=1;j<strs.length;j++) {
                if (i == strs[j].length() || c != strs[j].charAt(i)) {
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];

    }


    }


