/*
LeetCode 766 - Toeplitz Matrix

Question:
Check whether every diagonal from top-left to bottom-right contains the same value.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] a = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Compare element with its top-left neighbor
        for (int i = 0; i < r - 1; i++) {
            for (int j = 0; j < c - 1; j++) {
                if (a[i][j] != a[i + 1][j + 1]) {
                    System.out.println(false);
                    return;
                }
            }
        }

        System.out.println(true);
    }
}
