package com.acm.newcode.huaweijishi;

import java.util.Arrays;
import java.util.Scanner;


/*
* import java.io.*;
import java.util.*;

public class Main {
    // API中的sort方法大多使用快排或者归并排序；
    // stream可以更方便写代码，但在不同数据量但情况下效率不同，姑且可以认为更耗时
    public static void main(String[] args) throws IOException {
        withPriorityQueue();
    }

    // 方法一: 调用API实现
    public static void withArraysAPI() throws IOException {
        // read and store strings in an array from input stream
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] ss = new String[n];
        for (int i = 0; i < n; i++) {
            ss[i] = br.readLine();
        }
        br.close();

        // use stream to sort and output strings, which may use more time
        Arrays.stream(ss).sorted().forEach(System.out::println);

        // alternatively, use Arrays.sort(Object[] a) and for loop to output, which may use less time
    }

    // 方法二: 使用PriorityQueue
    public static void withPriorityQueue() throws IOException {
        // read and store strings in a priority queue from input stream
        PriorityQueue<String> pq = new PriorityQueue<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine(); // read the first line, but the number will not be used.
        String s;
        while ((s = br.readLine()) != null) {
            pq.offer(s);
        }
        br.close();

        // output
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }

    // 方法三: 使用list并自己实现Comparator
    public static void withComparator() throws IOException {
        // read and store strings in a list from input stream
        List<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine(); // read the first line, but the number will not be used.
        String s;
        while ((s = br.readLine()) != null) {
            list.add(s);
        }
        br.close();

        // sort with self defined comparator
        list.sort((s1, s2) -> {
            int i = 0;
            while (i < s1.length() && i < s2.length()) {
                if (s1.charAt(i) > s2.charAt(i)) {
                    return 1;
                } else if (s1.charAt(i) < s2.charAt(i)) {
                    return -1;
                } else {
                    i++;
                }
            }
            return s1.length() - s2.length();
        });

        // indeed, default comparator works for this case
        // list.sort(null);
        // or you may use Collections.sort method to avoid null
        // Collections.sort(list);

        // output
        list.forEach(System.out::println);
    }
}

* */
public class HJ14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int N = in.nextInt();
            String[] strings = new String[N];
            for (int i=0;i<N;i++) {
                strings[i] = in.next();
            }

            String[] res = function1(strings);
            Arrays.stream(res).forEach(System.out::println);
        }
    }

//BubbleSort
    private static String[] function1(String[] strings) {
        for (int i=0;i< strings.length;i++) {
            for (int j=1;j< strings.length-i;j++) {
                if (compare(strings[j-1],strings[j]) > 0) {
                    String temp = strings[j];
                    strings[j] = strings[j-1];
                    strings[j-1] = temp;
                }
            }
        }
        return strings;
    }

    private static int compare(String s1, String s2) {
        int index = 0;
        while (index < s1.length() && index < s2.length()) {
            if (s1.charAt(index) < s2.charAt(index)) {
                return -1;
            } else if (s1.charAt(index) > s2.charAt(index)) {
                return 1;
            } else {
                index++;
            }
        }
        return s1.length() - s2.length();
    }
}
