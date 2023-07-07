package com.acm.customer;

import java.util.Arrays;
import java.util.Scanner;

public class Main06 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            String[] str = new String[n];
            for (int i=0;i<n;i++) {
                str[i] = in.next();
            }
            Arrays.sort(str);


//            for (int i=0;i<n;i++) {
//                for (int j=1;j<n-i;j++){
//                    if (compare(str[j-1],str[j]) > 0) {
//                        String temp = str[j];
//                        str[j] = str[j-1];
//                        str[j-1] = temp;
//                    }
//                }
//            }
            for (int i=0;i<n;i++) {
                System.out.println(str[i]);
            }
        }
    }

    private static int compare(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        int sLen = Math.min(len1,len2);
        for (int i=0;i<sLen;i++) {
            if (s1.charAt(i) > s2.charAt(i)) {
                return 1;
            }else if (s1.charAt(i) < s2.charAt(i)) {
                return -1;
            }
        }
        return s1.length()-s2.length();

    }


}


