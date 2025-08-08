package com.acm.leecode;

import java.util.Scanner;

public class Main0014 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

        }
    }

    public String fun1_longestCommonPrefix(String[] strs) {

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

    public String fun2_longestCommonPrefix(String[] strs) {

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


