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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        triTuple[] t = new triTuple[N];
        int[] tmpX = new int[N];
        for (int i = 0; i < N; i++) {
            t[i].x = sc.nextInt();
            tmpX[i] = t[i].x;
            t[i].y = sc.nextDouble();
            t[i].z = sc.next();
        }

        Arrays.sort(tmpX);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (t[j].x == tmpX[i]) {
                    System.out.printf("%d %.2f %s\n", t[j].x, t[j].y, t[j].z);
                    break;
                }
            }
        }
    }
}

class triTuple {
    int x;
    double y;
    String z;
}