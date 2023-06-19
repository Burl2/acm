package com.acm.leecode;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main0151_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

            String s = in.nextLine();
            String[] split = s.split("[ ]+");
            List<String> collect = Arrays.stream(split).filter(s1 -> !s1.equals("")).collect(Collectors.toList());
            StringBuilder sb = new StringBuilder();
            for (int i=collect.size()-1;i>=0;i--) {
                sb.append(collect.get(i) + " ");
            }

            String res = sb.substring(0,sb.length()-1);
            System.out.println(res);

        }
    }





    }


