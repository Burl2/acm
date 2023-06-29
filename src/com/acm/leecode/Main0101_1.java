package com.acm.leecode;

import com.acm.structure.TreeNode;

import java.util.Scanner;

public class Main0101_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

        }
    }

    public boolean isSymmetric(TreeNode root) {

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


}


