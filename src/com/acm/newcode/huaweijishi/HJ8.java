package com.acm.newcode.huaweijishi;


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class HJ8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int N = in.nextInt();
            Map<Integer, Integer> treeMap = new TreeMap<>();
            for (int i=0;i<N;i++) {
                int key = in.nextInt();
                int value = in.nextInt();
                treeMap.merge(key, value, Integer::sum);
            }
            for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
