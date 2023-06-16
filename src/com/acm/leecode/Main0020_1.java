package com.acm.leecode;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Main0020_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

        }
    }
    public boolean isValid(String s) {

        if (s.length() % 2 == 1) return false;

        HashMap<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c=='[' || c == '{') {
                stack.push(c);
            } else {
                if (map.get(c) == stack.peek()) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        if (stack.empty()) {
            return true;
        }
        return false;
    }



    }


