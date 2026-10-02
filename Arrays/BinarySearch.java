/*
LeetCode 704 - Binary Search

Question:
Search for a target value in a sorted array.
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

        int left = 0, right = n - 1;

        // Binary search range loop
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (a[mid] == target) {
                System.out.println(mid);
                return;
            }

            if (a[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(-1);
    }
}
