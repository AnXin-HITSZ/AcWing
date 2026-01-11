package com.anxin_hitsz;

import java.util.Scanner;

/**
 * ClassName: ${NAME}
 * Package: com.anxin_hitsz
 * Description:
 *
 * @Author AnXin
 * @Create 2026/1/9 17:24
 * @Version 1.0
 *///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[6];
        for (int i = 0; i < 6; i++) {
            n[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < 6; i++) {
            if (n[i] > 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}