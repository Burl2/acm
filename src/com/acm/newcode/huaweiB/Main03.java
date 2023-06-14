package com.acm.newcode.huaweiB;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main03 {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int maxLen = -1;

        int l = 0, r = 0;

        boolean hasLetter = false;

        List<Integer> letterIdx = new ArrayList<>();

        while (r < line.length()) {
            if ((line.charAt(r) >= 'a' && line.charAt(r) <= 'z') || (line.charAt(r) >= 'A' && line.charAt(r) <= 'Z')) {
                hasLetter = true;
                letterIdx.add(r);

                if (letterIdx.size() > 1) {
                    l = letterIdx.remove(0) + 1;
                }

                if (r == l) {
                    r++;
                    continue;
                }
            }

            maxLen = Math.max(maxLen, r - l + 1);
            r++;
        }

        if (!hasLetter) System.out.println("-1");
        else System.out.println(maxLen);

    }
}
