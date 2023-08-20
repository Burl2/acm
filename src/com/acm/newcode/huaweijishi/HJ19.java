package com.acm.newcode.huaweijishi;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HJ19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
            while (in.hasNextLine()) {
                String s = in.nextLine();
                if (s.length() == 0) break;

                String[] split = s.split(" ");
                String address = split[0].substring(split[0].lastIndexOf("\\") + 1);
                if (address.length() > 16) {
                    address = address.substring(address.length() -16);
                }
                String row = split[1];
                String key = address + " " + row;
                if (linkedHashMap.containsKey(key)) {
                    linkedHashMap.put(key,linkedHashMap.get(key) + 1);
                } else {
                    linkedHashMap.put(key,1);
                }
            }
            int size = linkedHashMap.size();
            int count = 8 - size;
            for (Map.Entry<String,Integer> entry : linkedHashMap.entrySet()) {
                if (count >= 0) {
                    System.out.println(entry.getKey() + " " + entry.getValue());
                }
                count++;
            }
        }
    }
}
