package com.acm.newcode.huaweijishi;

import java.util.HashSet;
import java.util.Scanner;

public class HJ10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s = in.next();

            HashSet<Character> hashSet = new HashSet<>();
            for (char ch : s.toCharArray()) {
                if (ch <= 127) {
                    hashSet.add(ch);
                }
            }
            System.out.println(hashSet.size());
        }
    }
}
