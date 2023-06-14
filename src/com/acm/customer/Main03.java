package com.acm.customer;

import java.util.Scanner;

/*
* 题意：字符串中只存在A或者B两种字符，求最少修改次数即可实现非递减字符串，可同时修改A或者B，非递减字符串，及后面的字符不会小于前面的字符（ASCII码值，这里只有A、B两种字符，只有B后面不出现A即为非递减字符串）

示例1
输入：
AABBA
输出：
1
因为修改最后一个A为B即可，AABBB 为非递减字符串， 修改BB为AA也可以，但是修改次数为2，非最少次数。

作者：有码功成
链接：https://www.jianshu.com/p/aa29a7cd87fc
来源：简书
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
* */
public class Main03 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String s = in.nextLine();
            System.out.println(minModify(s));
        }

    }

    private static int minModify(String s) {
        if (s.isEmpty() || s.length() == 1) return 0;

        boolean exitB = false;
        int sumA = 0;
        for (Character c : s.toCharArray()){
            if (c == 'B' && !exitB) {
                exitB = true;
            }
            if (exitB && c == 'A') {
                sumA++;
            }
        }

        boolean exitA = false;
        int sumB = 0;
        for (int i=s.length()-1;i>=0;i--) {
            if (s.charAt(i) == 'A' && !exitA) {
                exitA = true;
            }
            if (s.charAt(i) == 'B' && exitA) {
                sumB++;
            }
        }
        return Math.min(sumA,sumB);

    }
}
