/*
Part 2 - 2D Array Program 4
Title: Transpose of a matrix (LC 867)
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
        int[][] b = new int[c][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                b[j][i] = a[i][j];
            }
        }
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) System.out.print(b[i][j] + " ");
            System.out.println();
        }
    }
}
