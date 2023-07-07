package com.acm.customer;

import java.util.Arrays;
import java.util.Scanner;

public class test07 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s = in.nextLine();
            String[] split = s.split(",");

            int[] arrayInt = Arrays.stream(split).mapToInt(Integer::parseInt).toArray();
            int[] preArray = new int[arrayInt.length];
            for (int i=0;i<arrayInt.length;i++) {
                preArray[i] = arrayInt[i];
            }
            Arrays.sort(arrayInt);
            int count =0;
            for (int i=0;i< preArray.length;i++) {
                if (!(preArray[i] == arrayInt[i]) ) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }




    }


