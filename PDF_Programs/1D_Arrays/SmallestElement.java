/*
Part 1 - 1D Array Program 7
Title: Smallest element
Input: n, then n integers
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int min = a[0];
        for (int i = 1; i < n; i++) {
            if (min > a[i]) min = a[i];
        }
        System.out.println(min);
    }
}
