package com.acm.test;

public class Test {

    public static void main(String[] args) {
//        for (int i=0;i<10;i++) {
//            System.out.println(""+i+":   " + (i >>  1));
//        }

        int x = 4;
        for (int i=0;i<10;i++) {
            System.out.println(x^i ^ i);
        }
    }
}
