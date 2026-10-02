/*
Part 1 - 1D Array Program 24
Title: Missing number (LC 268)
Input: n, then n distinct numbers from 0..n
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int total = n * (n + 1) / 2;
        int c = 0;
        for (int x : a) c += x;
        System.out.println(total - c);
    }
}
