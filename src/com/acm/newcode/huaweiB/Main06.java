package com.acm.newcode.huaweiB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main06 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String s = in.nextLine();
            int money = Integer.parseInt(in.nextLine());

            String[] split = s.split(",");
            if (split.length < 3) {
                System.out.println(-1);
            }
            ArrayList<Integer> list = new ArrayList<>();
            for (String pr : split) {
                list.add(Integer.parseInt(pr));
            }
            Collections.sort(list);
            int sum = 0;
            for (int i=0; i<3;i++) {
                sum += list.get(i);
            }
            if (sum > money) {
                System.out.println(-1);
            }

            for (int i=3;i<list.size();i++) {
                int changeBeforeSum = sum;
                sum = sum + list.get(i) - list.get(i-3);
                if (sum < money) continue;
                if (sum == money) System.out.println(money);
                if (sum > money) System.out.println(changeBeforeSum);
            }
        }
    }
}

//23,26,36,27
//78
//76
//23,30,40
