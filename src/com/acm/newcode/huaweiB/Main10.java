package com.acm.newcode.huaweiB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            int n = in.nextInt();
            ArrayList<Integer> heightList = new ArrayList<>();
            ArrayList<Integer> weightList = new ArrayList<>();
            ArrayList<Integer> peopleList = new ArrayList<>();
            for(int i=0;i<n;i++) {
                heightList.add(in.nextInt());
            }
            for(int i=0;i<n;i++) {
                weightList.add(in.nextInt());
            }
            for (int i=0;i<n;i++) {
                peopleList.add(i+1);
            }

            Collections.sort(peopleList, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    if (heightList.get(o1-1).equals(heightList.get(o2-1))) {
                        return weightList.get(o1-1).compareTo(weightList.get(o2-1));
                    }else {
                        return heightList.get(o1-1).compareTo(heightList.get(o2-1));
                    }
                }
            });
            for (int peopleNum : peopleList) {
                System.out.print(peopleNum+" ");
            }
            System.out.println();
        }

    }

}
