package com.acm.leecode;

import java.util.Scanner;
import java.util.Stack;

//每日温度
public class Main0739_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

        }
    }

    public int[] dailyTemperatures(int[] temperatures) {

        int length = temperatures.length;
        int[] res = new int[length];
        Stack<Integer> indexStack = new Stack<>();

        for (int i=0;i<length;i++) {
            while (!indexStack.isEmpty() && temperatures[indexStack.peek()] < temperatures[i]) {
                Integer index = indexStack.pop();
                res[index] = i-index;
            }
            indexStack.push(i);
        }
        return res;
    }


    }


