package com.acm.newcode.huawei;

import java.util.Scanner;
import java.util.TreeMap;

/*
*HJ102 字符统计
*
* 描述
输入一个只包含小写英文字母和数字的字符串，按照不同字符统计个数由多到少输出统计结果，如果统计的个数相同，则按照ASCII码由小到大排序输出。
数据范围：字符串长度满足 1 \le len(str) \le 1000 \1≤len(str)≤1000

输入描述：
一个只包含小写英文字母和数字的字符串。

输出描述：
一个字符串，为不同字母出现次数的降序表示。若出现次数相同，则按ASCII码的升序输出。

示例1
输入：
aaddccdc
复制
输出：
cda
复制
说明：
样例里，c和d出现3次，a出现2次，但c的ASCII码比d小，所以先输出c，再输出d，最后输出a.
* */
public class Main04 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {
            String s = in.nextLine();
//            System.out.println(count(s));
            System.out.println(countUseTreeMap(s));
        }
    }

    private static String countUseTreeMap(String s) {
        StringBuilder sb = new StringBuilder();
        TreeMap<Character, Integer> treeMap = new TreeMap<>();

        for (char c : s.toCharArray()) {
            if (treeMap.get(c) != null) {
                treeMap.put(c,treeMap.get(c)+1);
            }else {
                treeMap.put(c,1);
            }
        }

        int max = 0;
        for (int count : treeMap.values()) {
            if (count > max)
                max = count;
        }
        while (max > 0) {
            for (char c : treeMap.keySet()) {
                if (treeMap.get(c) == max) {
                    sb.append(c);
                }
            }
            max--;
        }
        return sb.toString();
    }

    private static String count(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] charArray = new int[129];
        for (char c : s.toCharArray()) {
            charArray[(int)c]++;
        }
        int max =0;
        for (int count : charArray) {
            if(count > max) {
                max = count;
            }
        }
        while (max >0) {
            for (int i=0;i<charArray.length;i++) {
                if (charArray[i] == max) {
                    stringBuilder.append((char) i);
                }
            }
            max--;
        }
        return stringBuilder.toString();
    }
}
