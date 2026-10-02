/*
Part 1 - 1D Array Program 13
Title: Linear search
Input: n, n integers, target
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
            if (a[i] == t) {
                System.out.println("Found at index " + i);
                return;
            }
        }
        System.out.println("Not found");
    }
}
