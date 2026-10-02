/*
Part 2 - 2D Array Program 6
Title: Richest customer wealth - max row sum (LC 1672)
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
        int max = 0;
        for (int i = 0; i < r; i++) {
            int s = 0;
            for (int j = 0; j < c; j++) {
                s += a[i][j];
            }
            if (s > max) max = s;
        }
        System.out.println(max);
    }
}
