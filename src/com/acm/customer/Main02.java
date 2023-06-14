package com.acm.customer;

import java.util.Scanner;

/*
*  题意：版本号比较，版本号规则：主版本号.次版本号.增量版本号-发布版本号， 主版本号、次版本号是必须的，主版本号、次版本号、增量版本号是数字，可能存在前导0，发布版本号为字符，可以按字典顺序进行比较，如果两个版本号相等，返回第一个版本号

输入：每个版本号按行输入，输入两个版本号

输出：版本号高的

示例1
输入：
1.05.1
1.5.1
输出：
1.05.1
两个版本号一样，输出第一个

示例2
输入：
1.5.2-A
1.5.2-a
输出：
1.5.2-a
因为 a 为97 大于 A 65

示例3
输入：
1.5
1.5.0
输出：
1.5.0
1.5.0有增量版本号，输出1.5.0

作者：有码功成
链接：https://www.jianshu.com/p/aa29a7cd87fc
来源：简书
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。*/


public class Main02 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {
            String first = in.nextLine();
            String second = in.nextLine();

            System.out.println(compareVersion(first, second));
        }
    }

    private static String compareVersion(String first, String second) {

        if (first == null || first.isEmpty()) return second;

        if (second == null || second.isEmpty()) return first;

        String firstNumVersion;
        String firstStringVersion;

        if (first.contains("-")) {
            firstNumVersion = first.split("-")[0];
            firstStringVersion = first.split("-")[1];
        } else {
            firstNumVersion = first;
            firstStringVersion = "";
        }

        String secondNumVersion;
        String secondStringVersion;

        if (second.contains("-")) {
            secondNumVersion = second.split("-")[0];
            secondStringVersion = second.split("-")[1];
        } else {
            secondNumVersion = second;
            secondStringVersion = "";
        }
        String[] split1 = firstNumVersion.split("\\.");
        String[] split2 = secondNumVersion.split("\\.");

        for (int i = 0; i < 2; i++) {
            int i1 = Integer.parseInt(split1[i]);
            int i2 = Integer.parseInt(split1[i]);
            if (i1 > i2) return first;
            if (i2 > i1) return second;
        }

        if (split1.length == split2.length && split1.length == 3) {
            int i1 = Integer.parseInt(split1[2]);
            int i2 = Integer.parseInt(split2[2]);
            if (i1 > i2) return first;
            if (i2 > i1) return second;
        } else if (split1.length > split2.length) {
            return first;
        } else {
            return second;
        }


        if (firstStringVersion.isEmpty()) {
            if (!secondStringVersion.isEmpty()) return second;
            return first;
        }

        int compare = firstStringVersion.compareTo(secondStringVersion);
        return compare >= 0 ? first : second;

    }
}
