package com.acm.leecode;

import java.util.Scanner;
import java.util.Stack;

public class Main2390 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

        }
    }

    public String f1_removeStars(String s) {

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '*') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.empty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }

    public String f2_removeStars(String s) {

        StringBuilder sb = new StringBuilder();
        char[] charArray = s.toCharArray();
        int sbIndex = -1;
        for (int i=0;i<charArray.length;i++) {
            if (charArray[i] == '*') {
                sb.deleteCharAt(sbIndex--);
            } else {
                sb.append(charArray[i]);
                sbIndex++;
            }
        }
        return sb.toString();
    }
}


