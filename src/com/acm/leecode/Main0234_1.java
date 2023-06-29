package com.acm.leecode;

import com.acm.structure.ListNode;

import java.util.Scanner;

public class Main0234_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

        }
    }

    public boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) return true;

        ListNode temp = head;
        ListNode slowPointNode = fastSlowPoint(temp);
        ListNode secondHeadNode = reverseLinkedList(slowPointNode.next);
        ListNode firstHeadNode = head;

//        while (secondHeadNode.next != null) {
//            if (firstHeadNode.val != secondHeadNode.val) {
//                return false;
//            }
//            firstHeadNode = firstHeadNode.next;
//            secondHeadNode = secondHeadNode.next;
//        }
        do {
            if (firstHeadNode.val != secondHeadNode.val) {
                return false;
            }
            firstHeadNode = firstHeadNode.next;
            secondHeadNode = secondHeadNode.next;
        } while (secondHeadNode != null);

        ListNode prevSecondHeadNode = reverseLinkedList(secondHeadNode);
        slowPointNode.next = prevSecondHeadNode;
        return true;
    }

    private ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    private ListNode fastSlowPoint(ListNode head) {
        ListNode slow = head;
        ListNode quick = head;
        while (quick.next != null && quick.next.next != null) {
            slow = slow.next;
            quick = quick.next.next;
        }
        return slow;
    }


}


