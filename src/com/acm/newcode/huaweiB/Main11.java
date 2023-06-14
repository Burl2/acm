package com.acm.newcode.huaweiB;

import java.util.Arrays;
import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String s = in.nextLine();
            String[] split = s.split(" ");

            Arrays.sort(split,((o1, o2) -> {
                int l1 = o1.length();
                int l2 = o2.length();

                int minL = Math.min(l1,l2);
//                String ls = l1 > l2 ? o1:o2;
//                String ss = l1 > l2 ? o2:o1;
                for (int i=0;i<minL;i++) {
                    if (o1.charAt(i) == o2.charAt(i)) {
                        continue;
                    }
                    return o2.compareTo(o1);
                }
                if(l1 == l2) {
                    return 0;
                }else if (l2>l1){
                    return o2.charAt(minL) - o2.charAt(0);
                } else {
                    return o1.charAt(0) - o1.charAt(minL );
                }

            }));
            StringBuilder sb = new StringBuilder();
            for (String str : split) {
                sb.append(str);
            }
            System.out.println(sb.toString());
        }
    }
}
