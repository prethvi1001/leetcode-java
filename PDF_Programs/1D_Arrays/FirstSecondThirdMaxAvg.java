/*
Part 1 - 1D Array Program 10
Title: 1st, 2nd and 3rd maximum + average
Input: n, then n integers
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int sum = 0;
        for (int x : a) sum += x;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] < a[j]) { // descending order
                    int t = a[i]; a[i] = a[j]; a[j] = t;
                }
            }
        }
        System.out.println("1st max: " + a[0]);
        if (n > 1) System.out.println("2nd max: " + a[1]);
        if (n > 2) System.out.println("3rd max: " + a[2]);
        System.out.println("Avg: " + (double) sum / n);
    }
}
