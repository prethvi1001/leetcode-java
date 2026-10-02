/*
LeetCode 2319 - Check if Matrix Is X-Matrix

Question:
Check whether all diagonal elements are non-zero and all other elements are zero.
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

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Check primary diagonal (i == j) and secondary diagonal (i + j == n - 1)
                if (i == j || i + j == n - 1) {
                    if (a[i][j] == 0) {
                        System.out.println(false);
                        return;
                    }
                } else if (a[i][j] != 0) {
                    System.out.println(false);
                    return;
                }
            }
        }

        System.out.println(true);
    }
}
