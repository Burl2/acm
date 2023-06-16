package com.acm.leecode;

import java.util.Scanner;

public class Main0014_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

        }
    }

    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) return "";


        String res = strs[0];

        for (int i=1;i<strs.length;i++) {
            int resIndex = 0;
            for (;resIndex<res.length() && resIndex < strs[i].length();resIndex++) {
                if (res.charAt(resIndex) != strs[i].charAt(resIndex)) {
                    break;
                }
            }
            res = res.substring(0,resIndex);
            if (res.equals("")) break;
        }
        return res;
    }


    }


