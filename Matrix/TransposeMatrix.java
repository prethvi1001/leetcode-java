/*
LeetCode 867 - Transpose Matrix

Question:
Return the transpose of a matrix where row indices and column indices are swapped.
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

        // Print column by column to get the transpose matrix
        for (int j = 0; j < c; j++) {
            for (int i = 0; i < r; i++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
