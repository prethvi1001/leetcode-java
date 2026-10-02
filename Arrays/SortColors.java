/*
LeetCode 75 - Sort Colors

Question:
Sort an array containing only 0, 1, and 2.
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

        // Sort colors in non-decreasing order
        Arrays.sort(a);

        for (int x : a) {
            System.out.print(x + " ");
        }
    }
}
