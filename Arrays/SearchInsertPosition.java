/*
LeetCode 35 - Search Insert Position

Question:
Find the index where the target should be inserted in a sorted array.
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

        int target = sc.nextInt();

        // First index where element is >= target is the insert position
        for (int i = 0; i < n; i++) {
            if (a[i] >= target) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(n);
    }
}
