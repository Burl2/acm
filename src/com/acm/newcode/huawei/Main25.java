package com.acm.newcode.huawei;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/*
*
* HJ68 成绩排序
*
* 输入：
3
0
fang 90
yang 50
ning 70
复制
输出：
fang 90
ning 70
yang 50
*
* */
public class Main25 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {
            int n = Integer.parseInt(in.nextLine());
            int flag = Integer.parseInt(in.nextLine());
//            int n = in.nextInt();
//            int flag = in.nextInt();
            String[] stringArr=  new String[n];
            for (int i=0;i<n;i++) {
                stringArr[i] = in.nextLine();
            }
            int[][] intArr = new int[n][2];
            HashMap<Integer, String> map = new HashMap<>();
            for (int i=0;i<n;i++) {
                intArr[i][0] = i;
                intArr[i][1] = Integer.parseInt(stringArr[i].split(" ")[1]);
                map.put(i,stringArr[i].split(" ")[0]);
            }
            Arrays.sort(intArr,((o1, o2) -> {
                if (flag == 1) {
                    return o1[1] - o2[1];
                }else {
                    return o2[1] - o1[1];
                }
            }));
            for (int i=0;i<n;i++) {
                System.out.println(map.get(intArr[i][0]) + " " + intArr[i][1]);
            }
        }
    }
}
