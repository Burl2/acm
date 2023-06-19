package com.acm.leecode;

import java.util.Scanner;

public class Main2390_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

        }
    }


    public String removeStars(String s) {

        StringBuilder sb = new StringBuilder();
        char[] charArray = s.toCharArray();
        int sbIndex = -1;
        for (int i=0;i<charArray.length;i++) {
            if (charArray[i] == '*') {
                sb.deleteCharAt(sbIndex--);
            } else {
                sb.append(charArray[i]);
                sbIndex++;
            }
        }
        return sb.toString();
    }


    }


