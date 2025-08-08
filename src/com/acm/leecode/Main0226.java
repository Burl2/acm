package com.acm.leecode;

import com.acm.structure.TreeNode;

import java.util.LinkedList;
import java.util.Scanner;

public class Main0226 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

        }
    }

    public TreeNode fun1_invertTree(TreeNode root) {

        if (root == null) return null;

        swap(root);
        fun1_invertTree(root.left);
        fun1_invertTree(root.right);
        return root;
    }

    private void swap(TreeNode treeNode) {
        TreeNode temp = treeNode.left;
        treeNode.left = treeNode.right;
        treeNode.right = temp;
    }

    public TreeNode fun2_finvertTree(TreeNode root) {

        if (root == null) return null;

        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            swap(node);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(root.right);
            }
        }
        return root;
    }

}


