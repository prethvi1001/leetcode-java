/*
Part 2 - 2D Array Program 2
Title: Sum of matrix diagonals (LC 1572)
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
        int s = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    s += a[i][j];
                }
            }
        }
        System.out.println(s);
    }
}
