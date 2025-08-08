package com.acm.leecode;

import java.util.*;

//小顶堆
public class Main0347 {

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

    public int[] fun1_topKFrequent(int[] nums, int k) {
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

    public int[] fun2_topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            if (hashMap.containsKey(num)) {
                hashMap.put(num,hashMap.get(num) +1);
            } else {
                hashMap.put(num,1);
            }
        }

        ArrayList<Integer> resList = new ArrayList<>();

        List<Integer>[] listArray = new List[nums.length + 1];

        for (Integer key : hashMap.keySet()) {
            if (listArray[hashMap.get(key)] == null) {
                listArray[hashMap.get(key)] = new ArrayList<>();
            }
            listArray[hashMap.get(key)].add(key);
        }
        for (int i= listArray.length-1;i >= 0 && resList.size()<k;i--) {
            resList.addAll(listArray[i]);
        }
        Integer[] integers = resList.toArray(new Integer[0]);
//        int[] res = resList.stream().mapToInt(Integer::intValue).toArray();
//        int[] res = resList.stream().mapToInt(Integer::valueOf).toArray();
        int[] res = Arrays.stream(integers).mapToInt(Integer::intValue).toArray();
        return res;
    }
}
