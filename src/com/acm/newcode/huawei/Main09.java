package com.acm.newcode.huawei;

import java.util.Scanner;


/*
* HJ29 字符串加解密
*
* 输入：
abcdefg
BCDEFGH
复制
输出：
BCDEFGH
abcdefg
* */
public class Main09 {

    private static final int AMOUNT = 32;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {
            String s1 = in.nextLine();
            String s2 = in.nextLine();

            System.out.println(encode(s1));

            System.out.println(decode(s2));
        }
    }

    private static String decode(String s2) {
        char[] t = s2.toCharArray();
        for(int i=0; i < t.length; i++){
            if(t[i]>'a' && t[i]<='z')
                t[i] = (char)(t[i] - 'a' + 'A' - 1);
            else if(t[i] == 'a')
                t[i] = 'Z';
            else if(t[i]>'A' && t[i]<='Z')
                t[i] = (char)(t[i] - 'A' + 'a' - 1);
            else if(t[i] == 'A')
                t[i] = 'z';
            else if(t[i]>'0' && t[i]<='9')
                t[i] = (char)(t[i]-1);
            else if(t[i] == '0')
                t[i] = '9';
        }
        return String.valueOf(t);
    }


    private static String encode(String s1) {
        char[] array = s1.toCharArray();
        for (int i=0;i< array.length;i++) {
            if (array[i] >= 'a' && array[i] < 'z') {
                array[i] = (char) (array[i] -AMOUNT + 1);
            } else if (array[i] == 'z') {
                array[i] = 'A';
            }else if (array[i] >= 'A' && array[i] < 'Z') {
                array[i] = (char) (array[i] + AMOUNT + 1);
            }else if (array[i] == 'Z') {
                array[i] = 'a';
            }else if (array[i] >= '0' && array[i] < '9') {
                array[i] = (char) (array[i] +1);
            }else {
                array[i] = '0';
            }
        }
        return String.valueOf(array);
    }
}
