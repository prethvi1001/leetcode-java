/*
Part 2 - 2D Array Program 5
Title: Toeplitz matrix (LC 766)
Input: rows, cols, then rows*cols integers
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt();
        int[][] a = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();
        for (int i = 0; i < r - 1; i++) {
            for (int j = 0; j < c - 1; j++) {
                if (a[i][j] != a[i + 1][j + 1]) {
                    System.out.println("false");
                    return;
                }
            }
        }
        System.out.println("true");
    }
}
