package com.acm.customer;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main05 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

        }
    }

    public static int[] everyDayTem(int[] tem) {
        int length = tem.length;
        int[] res = new int[length];
        Stack<Integer> stack = new Stack<>();

        for (int i=0;i<length;i++) {
            if (!stack.empty() && tem[i] > tem[stack.peek()]) {
                Integer preIndex = stack.pop();
                res[preIndex] = i-preIndex;
            }
            stack.push(i);
        }
        return res;
    }
}
