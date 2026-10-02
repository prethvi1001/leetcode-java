/*
Part 1 - 1D Array Program 27
Title: Single Number III (LC 260)
Input: n, then n integers (two appear once)
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int[] b = new int[2];
        int k = 0;
        for (int i = 0; i < n; i++) {
            int c = 0;
            for (int j = 0; j < n; j++) {
                if (a[i] == a[j]) c++;
            }
            if (c == 1) b[k++] = a[i];
        }
        System.out.println(b[0] + " " + b[1]);
    }
}
