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
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        while (N != 0) {
            String[] str = new String[N];
            for (int i = 0; i < N; i++) {
                str[i] = sc.next();
            }
            boolean flag = true;
            int minIndex = 201;
            for (int i = 0; i < N; i++) {
                if (str[i].length() < minIndex) {
                    minIndex = str[i].length();
                }
            }
            for (int i = 0; i < minIndex; i++) {
                for (int j = 0; j < N - 1; j++) {
                    if (str[j].charAt(str[j].length() - 1 - i) == str[j + 1].charAt(str[j + 1].length() - 1 - i)) {
                        flag = true;
                    } else {
                        flag = false;
                        break;
                    }
                }
                if (flag == false) {
                    if (i == 0) {
                        System.out.println();
                    } else {
                        for (int k = str[0].length() - i; k < str[0].length(); k++) {
                            System.out.print(str[0].charAt(k));
                        }
                    }
                    break;
                }
            }
        }
    }
}