package com.acm.leecode;

import java.util.Scanner;

public class Main0125_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

        }
    }

    public boolean isPalindrome(String s) {

        String s1 = s.replaceAll("[^a-zA-Z]+", "").toLowerCase();

        if (s1.length() == 0) return true;
        for (int i=0;i<s1.length()/2;i++) {
            if ( s1.charAt(i) == s1.charAt(s1.length()-1-i)) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }


    }


