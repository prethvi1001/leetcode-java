/*
Part 1 - 1D Array Program 32
Title: Search Insert Position (LC 35)
Input: n, n sorted integers, target
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int t = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (a[i] >= t) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(n);
    }
}
