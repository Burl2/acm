package com.acm.newcode.huaweijishi;


import java.util.Scanner;
import java.util.TreeSet;

public class HJ3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int N = in.nextInt();
            int[] ints = new int[N];
            for (int i=0;i<N;i++) {
                ints[i] = in.nextInt();
            }

            TreeSet<Integer> treeSet = new TreeSet<>();
//            Arrays.sort(ints);
            for (int i : ints) {
                treeSet.add(i);
            }
            for (int i : treeSet) {
                System.out.println(i);
            }
        }
    }
}
