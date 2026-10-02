/*
LeetCode 1480 - Running Sum of 1D Array

Question:
Find the running sum of an array.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Add previous element to current element to calculate running sum
        for (int i = 1; i < n; i++) {
            a[i] += a[i - 1];
        }

        for (int x : a) {
            System.out.print(x + " ");
        }
    }
}
