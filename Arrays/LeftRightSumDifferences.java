/*
LeetCode 2574 - Left and Right Sum Differences

Question:
Find the absolute difference between left sum and right sum for each element in an array.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            totalSum += a[i];
        }

        int leftSum = 0;
        int[] ans = new int[n];

        // Compute absolute difference between left sum and right sum
        for (int i = 0; i < n; i++) {
            int rightSum = totalSum - leftSum - a[i];
            ans[i] = Math.abs(leftSum - rightSum);
            leftSum += a[i];
        }

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}
