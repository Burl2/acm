package com.acm.leecode;

import com.acm.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main0094_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    }

    public List<Integer> inorderTraversal(TreeNode root) {

        ArrayList<Integer> list = new ArrayList<>();
        inorder(root,list);
        return list;
    }

    private void inorder(TreeNode root, ArrayList<Integer> list) {
        if (root == null) return;

        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }


}


