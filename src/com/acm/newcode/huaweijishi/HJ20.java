package com.acm.newcode.huaweijishi;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HJ20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s = in.next();

            if (s.length() <= 8) {
                System.out.println("NG");
                continue;
            }
            if (!isMatch(s)) {
                System.out.println("NG");
                continue;
            }
            if (isRepeat(s)) {
                System.out.println("NG");
                continue;
            }
            System.out.println("OK");
        }
    }

    private static boolean isRepeat(String s) {
        for (int start = 0, end = 3;end < s.length();start++, end++) {
            if (s.substring(start+1).contains(s.substring(start,end))) {
                return true;
            }
        }
        return false;
    }

    private static boolean isMatch(String s) {
        int count = 0;
        if (Pattern.compile("[A-Z]").matcher(s).find()) count++;
        if (Pattern.compile("[a-z]").matcher(s).find()) count++;
        if (Pattern.compile("[0-9]").matcher(s).find()) count++;
        if (Pattern.compile("[^a-zA-Z0-9]").matcher(s).find()) count++;
        return count >= 3;
    }
}
