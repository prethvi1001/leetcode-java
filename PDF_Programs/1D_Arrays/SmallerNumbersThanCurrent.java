/*
Part 1 - 1D Array Program 25
Title: How many numbers are smaller than the current (LC 1365)
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
            int c = 0;
            for (int j = 0; j < n; j++) {
                if (a[j] < a[i]) c++;
            }
            res[i] = c;
        }
        for (int x : res) System.out.print(x + " ");
    }
}
