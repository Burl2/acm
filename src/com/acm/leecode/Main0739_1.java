package com.acm.leecode;

import java.util.Scanner;
import java.util.Stack;

public class Main0739_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

        }
    }

    public int[] dailyTemperatures(int[] temperatures) {

        int[] res = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        for (int i=0;i< temperatures.length;i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                Integer index = stack.pop();
                res[index] = i-index;
            }
            stack.push(i);
        }
        return res;
    }


    }


