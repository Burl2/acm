package com.acm.leecode;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

//小顶堆
public class Main0347_1 {

    /*
*  int maxAmount = 0;
        for (int amount : hashMap.values()) {
            maxAmount = Math.max(maxAmount,amount);
        }
        int[][] sortInt = new int[hashMap.size()][1];
*
* */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


    }

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            if (hashMap.containsKey(num)) {
                hashMap.put(num,hashMap.get(num) +1);
            } else {
                hashMap.put(num,1);
            }
        }
        int[] res = new int[k];

        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> hashMap.get(o1) - hashMap.get(o2));

        for (Integer key : hashMap.keySet()) {
            if (pq.size() < k) {
                pq.add(key);
            } else {
                if (hashMap.get(key) > hashMap.get(pq.peek())) {
                    pq.remove();
                    pq.add(key);
                }
            }
        }
        for (int i=0;i<k;i++) {
            res[i] = pq.remove();
        }
        return res;
    }
}
