package com.acm.leecode;

import com.acm.structure.TreeNode;

import java.util.Scanner;

public class Main0226_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

        }
    }

    public TreeNode invertTree(TreeNode root) {

        if (root == null) return null;

        swap(root);
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    private void swap(TreeNode treeNode) {
        TreeNode temp = treeNode.left;
        treeNode.left = treeNode.right;
        treeNode.right = temp;
    }


}


