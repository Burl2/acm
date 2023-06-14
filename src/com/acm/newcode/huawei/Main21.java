package com.acm.newcode.huawei;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
* HJ66 配置文件恢复
*
* 输入：
reset
reset board
board add
board delet
reboot backplane
backplane abort
复制
输出：
reset what
board fault
where to add
no board at all
impossible
install first
* */
public class Main21 {

    private static final String[] he= new String[]{"he", "he"};
    private static final Map<String[], String> hashMap = new HashMap<String[], String>() {
        {
            put(new String[]{"reset"}, "reset what");
            put(new String[]{"reset", "board"}, "board fault");
            put(new String[]{"board", "add"}, "where to add");
            put(new String[]{"board", "delete"}, "no board at all");
            put(new String[]{"reboot", "backplane"}, "impossible");
            put(new String[]{"backplane", "abort"}, "install first");
            put(he, "unknown command");
        }
    };


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String s = in.nextLine();
//            System.out.println(s);
            System.out.println(output1(s));
        }
    }

    private static String output1(String s) {
        String[] split = s.split(" ");
        Set<String[]> set = hashMap.keySet();
        int count = 0;
        String[] matchKey = {};
        for (String[] key : set) {
            boolean match = isMatch(key,s);
            if (match) {
                count++;
                matchKey = key;
            }
        }
        if (count == 0 || count > 1) {
             matchKey = he;
        }
        return hashMap.get(matchKey);
    }

    private static boolean isMatch(String[] key, String s) {
        String[] input = s.split(" ");
        if (key.length != input.length) return false;
        for (int i=0;i< key.length;i++) {
            if (!key[i].startsWith(input[i])) {
                return false;
            }
        }
        return true;
    }
}
/*
*
*
reset
reset board
board add
board delet
reboot backplane
backplane abort
*
*
* */