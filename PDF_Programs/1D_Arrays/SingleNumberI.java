/*
Part 1 - 1D Array Program 26
Title: Single Number I (LC 136)
Input: n, then n integers (all twice except one)
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int c = 0;
            for (int j = 0; j < n; j++) {
                if (a[i] == a[j]) c++;
            }
            if (c == 1) {
                System.out.println(a[i]);
                return;
            }
        }
    }
}
