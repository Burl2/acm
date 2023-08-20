
package com.acm.newcode.huaweijishi;

import java.util.HashSet;
import java.util.Scanner;

public class HJ9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int num = in.nextInt();
            int len = String.valueOf(num).length();
            HashSet<Integer> hashSet = new HashSet<>();
            StringBuilder sb = new StringBuilder();
            for (int i=len-1;i>=0;i--) {
                int input = num % 10;
                if (hashSet.add(input)) {
                    sb.append(input);
                }
                num = num / 10;
            }
            System.out.println(Integer.parseInt(sb.toString()));
        }
    }
}
