package com.acm.newcode.huawei;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

/*
*HJ94 记票统计
*
*
* 输入：
4
A B C D
8
A D E CF A GG A B
复制
输出：
A : 3
B : 1
C : 0
D : 1
Invalid : 3
复制
说明：
E CF GG三张票是无效的，所以Invalid的数量是3.
* */
public class Main27 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            int amount = in.nextInt();
            String[] houxuan = new String[amount];
            for (int i=0; i<amount;i++) {
                houxuan[i] = in.next();
            }
            int xuanpiaoAmount = in.nextInt();
            String[] xuanpiao = new String[xuanpiaoAmount];
            for (int i=0; i<xuanpiaoAmount;i++) {
                xuanpiao[i] = in.next();
            }

//            HashMap<String, Integer> hashMap = new LinkedHashMap<>();
            HashMap<String, Integer> hashMap = new HashMap<>();
            for (String houxuanren : houxuan) {
                hashMap.put(houxuanren,0);
            }
            hashMap.put("Invalid",0);
            for (String piao: xuanpiao) {
                if (hashMap.get(piao) != null) {
                    hashMap.put(piao, hashMap.get(piao) +1 );
                }else {
                    hashMap.put("Invalid",hashMap.get("Invalid") +1);
                }
            }
            hashMap.forEach((k,v)->{
                System.out.println(k+ " : "+ v);
            });
        }
    }
}
