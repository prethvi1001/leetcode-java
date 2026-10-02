/*
================================================================
               ALL 2D MATRIX LEETCODE PROGRAMS IN ONE FILE
================================================================
Includes:
1. LeetCode 867  - Transpose Matrix
2. LeetCode 1672 - Richest Customer Wealth
3. LeetCode 2319 - Check if Matrix Is X-Matrix
4. LeetCode 1572 - Matrix Diagonal Sum
5. LeetCode 766  - Toeplitz Matrix
*/

import java.util.*;

public class Matrix2DPrograms {

    // 1. LeetCode 867 - Transpose Matrix
    public static int[][] transpose(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[][] ans = new int[c][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }

    // 2. LeetCode 1672 - Richest Customer Wealth
    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] customer : accounts) {
            int sum = 0;
            for (int bank : customer) sum += bank;
            max = Math.max(max, sum);
        }
        return max;
    }

    // 3. LeetCode 2319 - Check if Matrix Is X-Matrix
    public static boolean checkXMatrix(int[][] grid) {
        int n = grid.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    if (grid[i][j] == 0) return false;
                } else if (grid[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    // 4. LeetCode 1572 - Matrix Diagonal Sum
    public static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }

    // 5. LeetCode 766 - Toeplitz Matrix
    public static boolean isToeplitzMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        for (int i = 0; i < r - 1; i++) {
            for (int j = 0; j < c - 1; j++) {
                if (matrix[i][j] != matrix[i + 1][j + 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("--- Testing 2D Matrix Programs ---");

        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("1. Transpose Matrix: " + Arrays.deepToString(transpose(mat)));
        System.out.println("2. Richest Customer Wealth: " + maximumWealth(new int[][]{{1, 2, 3}, {3, 2, 1}}));
        System.out.println("3. Check X-Matrix: " + checkXMatrix(new int[][]{{2, 0, 0, 1}, {0, 3, 1, 0}, {0, 5, 2, 0}, {4, 0, 0, 2}}));
        System.out.println("4. Matrix Diagonal Sum: " + diagonalSum(mat));
        System.out.println("5. Toeplitz Matrix Check: " + isToeplitzMatrix(new int[][]{{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}}));
    }
}
