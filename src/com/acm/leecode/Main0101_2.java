package com.acm.leecode;

import com.acm.structure.TreeNode;

import java.util.LinkedList;
import java.util.Scanner;

public class Main0101_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

        }
    }

    public boolean isSymmetric(TreeNode root) {

        TreeNode left = root.left;
        TreeNode right = root.right;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(left);
        queue.add(right);

        while (!queue.isEmpty()) {
            TreeNode leftNode = queue.removeFirst();
            TreeNode rightNode = queue.removeFirst();
            if (leftNode == null && rightNode == null) continue;
            if (leftNode == null || rightNode == null) return false;
            if (leftNode.val != rightNode.val) return false;
            queue.add(leftNode.left);
            queue.add(rightNode.right);
            queue.add(leftNode.right);
            queue.add(rightNode.left);
        }
        return true;
    }




}


