package com.acm.newcode.huaweiB;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main07 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String s = in.nextLine();

            String[] split = s.split(" ");
            Pattern pattern = Pattern.compile("[^a-zA-Z]");
            int count = 0;
            for (String st : split) {
                Matcher matcher;
                if (pattern.matcher(st).find()) {
                     matcher = Pattern.compile("[^aeiou][aeiou][^aeiour]e").matcher(st);
                } else {
                    matcher = Pattern.compile("e[^aeiour][aeiou][^aeiou]").matcher(st);
                }
                for (int i=0;i<st.length()-3;i++) {
                    if (matcher.find(i) && matcher.start() == i) count++;
                }
            }
            System.out.println(count);
        }
    }
}
