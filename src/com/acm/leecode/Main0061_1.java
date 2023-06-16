package com.acm.leecode;

import com.acm.structure.ListNode;

import java.util.Scanner;

public class Main0061_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return head;
        if (k == 0) return  head;
        ListNode tempNode = head;
        int length = 1;
        while (tempNode.next != null) {
            length++;
            tempNode= tempNode.next;
        }
        ListNode endNode = tempNode;
        int kk = k % length;
        if (kk == 0) return head;
        tempNode = head;
        for (int i=1;i<length-kk;i++) {
            tempNode = tempNode.next;
        }
//        ListNode yuanlaifirstNode = head;
        ListNode firstNode = tempNode.next;
        tempNode.next = null;
//        head.next = firstNode;
        endNode.next = head;
        return firstNode;
    }


    }


