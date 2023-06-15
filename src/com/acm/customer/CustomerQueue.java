package com.acm.customer;

import java.util.EmptyStackException;
import java.util.Stack;

/*
* 用两个栈实现一个队列的功能
* */
public class CustomerQueue {


    /*
    * private int capacity;
    public CustomerQueue(int capacity) {
        this.capacity = capacity;
    }
    * */
    private final Stack<String> stack1 = new Stack<>();
    private final Stack<String> stack2 = new Stack<>();

    public String push(String s) {
        stack1.push(s);
        return s;
    }

    public String pop() {
        if (stack2.isEmpty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
            try {
                return stack2.pop();
            }catch (EmptyStackException e) {
                return "此时队列为空，无法取出数来";
            }
        } else {
            return stack2.pop();

        }

    }

    public static void main(String[] args) {
        CustomerQueue customerQueue = new CustomerQueue();
        System.out.println(customerQueue.push("123"));
        String s = customerQueue.pop();
        System.out.println(s);
        String s2 = customerQueue.pop();
        System.out.println(s2);
    }
}
