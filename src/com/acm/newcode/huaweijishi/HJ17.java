package com.acm.newcode.huaweijishi;

import java.util.Scanner;

public class HJ17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s = in.next();
            String[] split = s.split(";");

            int x =0, y=0;
            for (String str : split) {
                if (!str.matches("[WASD][0-9]{1,2}")) {
                    continue;
                }
                char op = str.charAt(0);
                int move = Integer.parseInt(str.substring(1));
                switch (op) {
                    case 'W':
                        y += move;
                        break;
                    case 'S' :
                        y -= move;
                        break;
                    case 'A' :
                        x -= move;
                        break;
                    case 'D' :
                        x += move;
                        break;
                }
            }
            System.out.println(x + "," + y);
        }
    }
}
