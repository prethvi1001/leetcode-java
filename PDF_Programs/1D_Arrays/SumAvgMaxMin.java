/*
Part 1 - 1D Array Program 9
Title: Sum, average, max and min
Input: n, then n integers
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int sum = 0, max = a[0], min = a[0];
        for (int i = 0; i < n; i++) {
            sum += a[i];
            if (max < a[i]) max = a[i];
            if (min > a[i]) min = a[i];
        }
        System.out.println("Sum: " + sum);
        System.out.println("Avg: " + (double) sum / n);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
