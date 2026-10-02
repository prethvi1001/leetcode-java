/*
LeetCode 1572 - Matrix Diagonal Sum

Question:
Find the sum of both diagonals of a square matrix.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        // Sum primary diagonal (i == j) and secondary diagonal (i + j == n - 1)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    sum += a[i][j];
                }
            }
        }

        System.out.println(sum);
    }
}
