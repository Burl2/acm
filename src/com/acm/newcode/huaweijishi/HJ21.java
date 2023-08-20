package com.acm.newcode.huaweijishi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HJ21 {
    private static final Map<String,Integer> map = new HashMap<String,Integer>() {{
        put("abc", 2);
        put("def", 3);
        put("ghi", 4);
        put("jkl", 5);
        put("mno", 6);
        put("pqrs", 7);
        put("tuv", 8);
        put("wxyz", 9);
    }};
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s = in.next();

            StringBuilder sb = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (c >= 'a' && c <= 'z') {
                    for (String key : map.keySet()) {
                        if (key.contains(String.valueOf(c))) {
                            sb.append(map.get(key));
                        }
                    }
                } else if (c >= 'A' && c <= 'Y') {
                    sb.append((char) (c + 32 + 1) );
                } else if (c == 'Z') {
                    sb.append('a');
                } else {
                    sb.append(c);
                }
            }
            System.out.println(sb);
        }
    }
}
