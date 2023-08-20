package com.acm.newcode.huaweijishi;

import java.util.Scanner;

public class HJ18 {
    /*
    10.70.44.68~255.255.255.0
1.0.0.1~255.0.0.0
192.168.0.2~255.255.255.0
19..0.~255.255.255.0*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int aIpAmount = 0, bIpAmount = 0, cIpAmount = 0, dIpAmount = 0, eIpAmount = 0, errorIpOrMaskAmount = 0, privateIpAmount = 0;
            while (in.hasNextLine()) {
                String s = in.nextLine();
                if (s.length() == 0) break;
                String ip = s.split("~")[0];
                String mask = s.split("~")[1];
                int firstIpSegment = Integer.parseInt(ip.split("\\.")[0]);
                if (firstIpSegment == 0 || firstIpSegment == 127) continue;
                if (!isValidIpAddress(ip)) {
                    errorIpOrMaskAmount++;
                    continue;
                }
                if (!isValidMaskAddress(mask)) {
                    errorIpOrMaskAmount++;
                    continue;
                }
                if (firstIpSegment >= 1 && firstIpSegment <= 126) {
                    aIpAmount++;
                } else if (firstIpSegment >= 128 && firstIpSegment <= 191) {
                    bIpAmount++;
                } else if (firstIpSegment >= 191 && firstIpSegment <= 223) {
                    cIpAmount++;
                } else if (firstIpSegment >= 224 && firstIpSegment <= 239) {
                    dIpAmount++;
                } else if (firstIpSegment >= 240 && firstIpSegment <= 255) {
                    eIpAmount++;
                }
                int secondIpSegment = Integer.parseInt(ip.split("\\.")[1]);
                if (firstIpSegment == 10 || (firstIpSegment == 172 && secondIpSegment >= 16 && secondIpSegment <= 31)
                || (firstIpSegment == 192 && secondIpSegment == 168)) {
                    privateIpAmount++;
                }
            }
            System.out.println(aIpAmount + " " + bIpAmount + " " + cIpAmount + " " + dIpAmount + " " + eIpAmount + " " + errorIpOrMaskAmount + " " + privateIpAmount);
        }
    }

    private static boolean isValidMaskAddress(String mask) {
        String[] split = mask.split("\\.");
        if (split.length != 4) return false;
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<4;i++) {
            String binaryString = Integer.toBinaryString(Integer.parseInt(split[i]));
            if (binaryString.length() == 8) {
                sb.append(binaryString);
            } else if (Integer.parseInt(binaryString) == 0) {
                sb.append("00000000");
            } else return false;
        }
        return sb.toString().matches("1+0+");
    }

    private static boolean isValidIpAddress(String ip) {
        String[] split = ip.split("\\.");
        if (split.length != 4) return false;
        int ipSeg1 = Integer.parseInt(split[0]);
        int ipSeg2 = Integer.parseInt(split[1]);
        int ipSeg3 = Integer.parseInt(split[2]);
        int ipSeg4 = Integer.parseInt(split[3]);
        return (ipSeg1 >= 1 && ipSeg1 <= 255) && (ipSeg2 >= 0 && ipSeg2 <= 255) && (ipSeg3 >= 0 && ipSeg3 <= 255) && (ipSeg4 >= 0 && ipSeg4 <= 255);
    }
}
