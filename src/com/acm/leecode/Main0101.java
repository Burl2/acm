package com.acm.leecode;

import com.acm.structure.TreeNode;

import java.util.LinkedList;
import java.util.Scanner;

public class Main0101 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

        }
    }

    public boolean fun1_isSymmetric(TreeNode root) {

        TreeNode left = root.left;
        TreeNode right = root.right;
        return dfs(left,right);
    }

    private boolean dfs(TreeNode left, TreeNode right) {
       if (left == null && right == null) return true;
       if (left == null || right == null) return false;
       if (left.val != right.val) return false;
       return dfs(left.left,right.right) && dfs(left.right, right.left);
    }


    public boolean fun2_isSymmetric(TreeNode root) {

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


