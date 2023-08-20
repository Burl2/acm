package com.acm.newcode.huaweijishi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HJ23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s = in.next();

            HashMap<Character, Integer> map = new HashMap<>();
            for (char ch : s.toCharArray()) {
                map.put(ch, map.getOrDefault(ch, 0) +1);
            }
            int minAmount = Integer.MAX_VALUE;
            ArrayList<Character> list = new ArrayList<>();
            for (char ch : map.keySet()) {
                int amount = map.get(ch);
                if (amount < minAmount) {
                    list.clear();
                    list.add(ch);
                    minAmount = amount;
                } else if (amount == minAmount) {
                    list.add(ch);
                }
            }
            for (char ch : list) {
                s = s.replaceAll( String.valueOf(ch) , "");
            }
            System.out.println(s);
        }
    }
}
