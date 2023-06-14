package com.acm.newcode.huawei;

import com.acm.structure.NodeList;

import java.util.Scanner;

/*
*HJ51 输出单向链表中倒数第k个结点
*
* 描述
输入一个单向链表，输出该链表中倒数第k个结点，链表的倒数第1个结点为链表的尾指针。

链表结点定义如下：
struct ListNode
{
    int m_nKey;
    ListNode* m_pNext;
};
正常返回倒数第k个结点指针，异常返回空指针.
要求：
(1)正序构建链表;
(2)构建后要忘记链表长度。
数据范围：链表长度满足 1 \le n \le 1000 \1≤n≤1000  ， k \le n \k≤n  ，链表中数据满足 0 \le val \le 10000 \0≤val≤10000

本题有多组样例输入。


输入描述：
输入说明
1 输入链表结点个数
2 输入链表的值
3 输入k的值

输出描述：
输出一个整数

示例1
输入：
8
1 2 3 4 5 6 7 8
4
复制
输出：
5
* */
//这个题有个bug，62行提取的k值会等于前后两次输入的k值的拼接字符串。
public class Main06 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            int n = in.nextInt();
            NodeList head = new NodeList(-1);
            NodeList temp = head;

            for (int i=0;i<n;i++) {
                NodeList node = new NodeList(in.nextInt());
                temp.next = node;
                temp = temp.next;
            }
            int k = in.nextInt();
            NodeList res = getKthFromEnd(head.next,k);
            if (res != null) {
                System.out.println(res.val);
            }else {
                System.out.println(0);
            }

        }


}

    private static NodeList getKthFromEnd(NodeList firstNode, int k) {
        if (firstNode == null) return null;
        NodeList fastNode = firstNode;
        NodeList slowNode = firstNode;
        for (int i=0;i<k;i++) {
            if (fastNode == null) return fastNode;
            fastNode = fastNode.next;
        }
        while (fastNode != null) {
            fastNode = fastNode.next;
            slowNode = slowNode.next;
        }
        return slowNode;
    }
    }
