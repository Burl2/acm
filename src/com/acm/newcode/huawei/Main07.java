package com.acm.newcode.huawei;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
* HJ26 字符串排序
* */
public class Main07 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String s = in.nextLine();

            ArrayList<Character> list = new ArrayList<>();
            for (char c : s.toCharArray()) {
                if (Character.isLetter(c)) {
                    list.add(c);
                }
            }

            list.sort(new Comparator<Character>() {
                @Override
                public int compare(Character o1, Character o2) {
                    return Character.toLowerCase(o1) - Character.toLowerCase(o2);
                }
            });

            StringBuilder sb = new StringBuilder();
            int index = 0;
            for (char c : s.toCharArray()) {
                if (Character.isLetter(c)) {
                    sb.append(list.get(index++));
                }else {
                    sb.append(c);
                }
            }
            System.out.println(sb.toString());
        }
    }
}
