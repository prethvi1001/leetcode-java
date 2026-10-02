/*
Part 1 - 1D Array Program 29
Title: Remove duplicates from sorted array (LC 26)
Input: n, then n sorted integers
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int j = 1;
        for (int i = 1; i < n; i++) {
            if (a[i] != a[i - 1]) {
                a[j] = a[i];
                j++;
            }
        }
        System.out.println("Unique count: " + j);
        for (int i = 0; i < j; i++) System.out.print(a[i] + " ");
    }
}
