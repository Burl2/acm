package com.acm.newcode.huawei;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
* HJ27 查找兄弟单词
* */

/*
* 输入：
3 abc bca cab abc 1
复制
输出：
2
bca*/
public class Main08 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            int wordAmount = in.nextInt();
            String[] inputStringArray = new String[wordAmount];
            for (int i=0;i<wordAmount;i++) {
                inputStringArray[i] = in.next();
            }
            String targetWord = in.next();
            int key = in.nextInt();

            ArrayList<String> brotherWordList = new ArrayList<>();
            for (String s : inputStringArray) {
                if (isBrotherWord(s,targetWord)) {
                    brotherWordList.add(s);
                }
            }

            int count = brotherWordList.size();
            System.out.println(count);
            if (count >= key) {
                Collections.sort(brotherWordList);

                System.out.println(brotherWordList.get(key-1));
            }


        }
    }

    private static boolean isBrotherWord(String s, String targetWord) {
        if (s.length() != targetWord.length() || s.equals(targetWord)) {
            return false;
        }
            char[] charArray1 = s.toCharArray();
            char[] charArray2 = targetWord.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            return new String(charArray1).equals(new String(charArray2));
    }
}
