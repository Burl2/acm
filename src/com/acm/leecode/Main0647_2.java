package com.acm.leecode;

import java.util.Scanner;

public class Main0647_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String s = in.nextLine();
            
            int res = countSubstrings(s);
            System.out.println(res);
        }
    }

    public static int countSubstrings(String s) {
        int count = 0;
        boolean[][] dp = new boolean[s.length()+1][s.length()+1];

        for (int i=0;i<s.length();i++) {
            for (int j=i;j<s.length();j++) {
                if (s.charAt(i) == s.charAt(j) && ( j-i < 2 || dp[i+1][j-1])) {
                    count++;
                    dp[i][j] = true;
                }
            }
        }
        return count;
    }


}
