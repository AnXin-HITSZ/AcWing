package com.anxin_hitsz;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * ClassName: ${NAME}
 * Package: com.anxin_hitsz
 * Description:
 *
 * @Author AnXin
 * @Create 2026/1/2 19:18
 * @Version 1.0
 *///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {

    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static class Solution {
        public ListNode reverseList(ListNode head) {
            if (head.next == null) {
                return head;
            } else {
                ListNode pre = head;
                ListNode tail = head.next;
                while (tail != null) {
                    pre.next.next = pre;
                    pre = tail;
                    tail = tail.next;
                }
                head.next = null;
                return pre;
            }
        }
    }
}