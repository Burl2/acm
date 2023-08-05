package com.acm.test;

public class Test {

    public static void main(String[] args) {
//        for (int i=0;i<10;i++) {
//            System.out.println(""+i+":   " + (i >>  1));
//        }

//        int x = 4;
//        for (int i=0;i<10;i++) {
//            System.out.println(x^i ^ i);
//        }

        int x = 1;
        int y = 1;
        if(x++==2&++y==2){
            x=10;
        }
        System.out.println("二、x为"+x+"，y为"+y+"。");

        new Test().test();
    }

    public void test() {
        init();
        load();
        test2("test");
    }

    private void test2(String test) {
        System.out.println(test);
    }

    private void load() {
        System.out.println("load");
    }

    private void init() {
        System.out.println("init");
    }


}
