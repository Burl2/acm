package com.acm.newcode.huawei;

import org.jetbrains.annotations.NotNull;

import java.util.*;

/*
* HJ36 字符串加密
*
* 输入：
nihao
ni
复制
输出：
le
*
TRAILBLAZERS
Attack AT DAWN
*
* Tpptad TP ITVH
* */
public class Main12 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {
            String secretKey = in.nextLine().toLowerCase();
            String plaintext = in.nextLine();

//            System.out.println(encrypt1(secretKey,plaintext));
            System.out.println(encrypt2(secretKey,plaintext));
        }
    }

    private static @NotNull
    String encrypt2(@NotNull String secretKey, String plaintext) {
        List<Character> list = new ArrayList<>();
        for (char c : secretKey.toCharArray()) {
            if (!list.contains(c)) {
                list.add(c);
            }
        }
        for (int i=97;i<=122;i++) {
            if (!list.contains((char)i)) {
                list.add((char)i);
            }
        }

        Map<Character, Character> hashMap = new HashMap<>();
        for (int i = 97;i<=122;i++) {
            hashMap.put((char)i,list.get(i-97));
        }
        StringBuilder sb = new StringBuilder();
        for (char c : plaintext.toCharArray()) {
            if (c == ' ') {
                sb.append(" ");
                continue;
            }
            if (Character.isUpperCase(c)) {
                sb.append(Character.toUpperCase(hashMap.get(Character.toLowerCase(c))));
            } else {
                sb.append(hashMap.get(c));
            }
        }
        return sb.toString();
    }

    private static @NotNull String encrypt1(@NotNull String secretKey, String plaintext) {
        List<Character> list = new ArrayList<>();
        for (char c : secretKey.toCharArray()) {
            if (!list.contains(c)) {
                list.add(c);
            }
        }
        for (int i=97;i<=122;i++) {
            if (!list.contains((char)i)) {
                list.add((char)i);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : plaintext.toCharArray()) {
            if (c == ' ') {
                sb.append(" ");
                continue;
            }
            if (Character.isLowerCase(c)) {
                sb.append(list.get((int)c-97));
            } else {
                sb.append(Character.toUpperCase(list.get((int)c-(int)'A')));
            }
        }
        return sb.toString();
    }
}
