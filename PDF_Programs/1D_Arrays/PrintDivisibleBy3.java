/*
Part 1 - 1D Array Program 12
Title: Print values divisible by 3
Input: n, then n integers
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (a[i] % 3 == 0) System.out.print(a[i] + " ");
        }
    }
}
