package com.acm.customer;

import java.util.Scanner;
import java.util.Stack;

/*
题意：反转单词，每行输入一个字符串，字符串含有单词和字符 .,? ，要求对单词进行反转， 单词间空格>0， 字符 .,? 间空格 >= 0, 反转结果输出一行。(靠记忆整理)

示例1：
输入：
My name is Bob.
输出：
yM eman si boB.

示例2：
输入：
How are you ? i am fine
输出：
woH era uoy ? i ma enif

作者：有码功成
链接：https://www.jianshu.com/p/aa29a7cd87fc
来源：简书
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
* */
public class Main01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String s = in.nextLine();
            String res = reverseLine(s);
            System.out.println(res);
        }


    }

    private static String reverseLine(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuffer buffer = new StringBuffer();

        for (Character c : s.toCharArray()) {
            if(c == ' ' || c == '.' || c == '?' || c == ',') {
                if (!stack.empty()) buffer.append(stackToString(stack));
                buffer.append(c);
            }else {
                stack.push(c);
            }
        }
        if (!stack.empty()) {
            buffer.append(stackToString(stack));
        }
        return buffer.toString();
    }

    private static String stackToString(Stack<Character> stack) {
        StringBuffer buffer = new StringBuffer();
       while (!stack.empty()) {
            buffer.append(stack.pop());
        }
        return buffer.toString();
    }

}
