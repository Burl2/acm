package com.acm.customer;

import java.util.Scanner;

public class Main08 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

            String s = in.nextLine();
            String[] split = s.split("\\s+");

            int maxLen = 0;
            for (String str : split) {
                maxLen = Math.max(maxLen,str.length());
            }
            System.out.println(maxLen);
        }
    }




    }


