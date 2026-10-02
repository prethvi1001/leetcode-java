/*
Part 1 - 1D Array Program 34
Title: Left and right sum differences (LC 2574)
Input: n, then n integers
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int l = 0, r = 0;
            for (int j = 0; j < i; j++) l += a[j];
            for (int j = i + 1; j < n; j++) r += a[j];
            res[i] = Math.abs(l - r);
        }
        for (int x : res) System.out.print(x + " ");
    }
}
