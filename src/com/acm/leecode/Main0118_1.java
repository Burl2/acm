package com.acm.leecode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main0118_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

        }
    }

/*

    public static void TODOFun() {

    }

*/
public List<List<Integer>> generate(int numRows) {

    List<List<Integer>> res = new ArrayList<List<Integer>>();

//    if (numRows == 0) return res;
    for (int i = 1; i <= numRows; i++) {
        List<Integer> rowList = new ArrayList<Integer>();
        for (int j = 0; j < i; j++) {
            if (j == 0 || j == i - 1) {
                rowList.add(1);
            } else {
                rowList.add(res.get(i - 2).get(j - 1) + res.get(i - 2).get(j));
            }
        }
        res.add(rowList);
    }
    return res;
}
//    public List<List<Integer>> generate(int numRows) {
//        List<List<Integer>> ret = new ArrayList<List<Integer>>();
//        for (int i = 0; i < numRows; ++i) {
//            List<Integer> row = new ArrayList<Integer>();
//            for (int j = 0; j <= i; ++j) {
//                if (j == 0 || j == i) {
//                    row.add(1);
//                } else {
//                    row.add(ret.get(i - 1).get(j - 1) + ret.get(i - 1).get(j));
//                }
//            }
//            ret.add(row);
//        }
//        return ret;
//    }





    }


