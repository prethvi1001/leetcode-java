/*
Part 2 - 2D Array Program 3
Title: Check if matrix is X-Matrix (LC 2319)
Input: n, then n x n integers
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    if (a[i][j] == 0) { System.out.println("false"); return; }
                } else {
                    if (a[i][j] != 0) { System.out.println("false"); return; }
                }
            }
        }
        System.out.println("true");
    }
}
