package com.acm.leecode;

import java.util.Scanner;

public class Main0392_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

        }
    }


    public boolean isSubsequence(String s, String t) {

        if (s.equals(t)) return true;
        int index = 0;
        for (int i=0;i<t.length();i++) {
            if (index == s.length()) break;
            if (t.charAt(i) == s.charAt(index)) {
                index++;
            }
        }
        return index == s.length();
    }


    }


