package com.acm.newcode.huaweiB;

import java.util.*;

public class Main04 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String s = in.nextLine();

            String[] split = s.split(" ");
            int maxAmount = 0;
            ArrayList<Integer> list = new ArrayList<>();
            HashMap<String, Integer> hashMap = new HashMap<>();
            int res = 0;
            for (String st : split) {
                if (hashMap.get(st) == null) {
                    hashMap.put(st,1);
                }else {
                    hashMap.put(st,hashMap.get(st)+1);
                }
            }
            for (int amount : hashMap.values()) {
                if (amount > maxAmount) {
                    maxAmount = amount;
                }
            }
            for (Map.Entry<String,Integer> entry : hashMap.entrySet()) {
                if (entry.getValue() == maxAmount) {
                    list.add(Integer.parseInt(entry.getKey()));
                }
            }
            Collections.sort(list);
            int listSize = list.size();
            if (listSize %2 == 1) {
                res = list.get(listSize/2);
            }else {
                res = (list.get(listSize/2 - 1) + list.get(listSize/2)) / 2;
            }
            System.out.println(res);
        }
    }
}
//10 11 21 19 21 17 21 16 21 18 15