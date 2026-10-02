/*
Part 1 - 1D Array Program 14
Title: Binary search (iterative) - array must be sorted
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
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a[m] == t) {
                System.out.println("Found at index " + m);
                return;
            } else if (a[m] < t) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        System.out.println("Not found");
    }
}
