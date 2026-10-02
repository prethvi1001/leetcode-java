/*
LeetCode 260 - Single Number III

Question:
Given an array where elements appear twice except two numbers which appear once, find the two numbers.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        int xorSum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            xorSum ^= a[i];
        }

        // Get the rightmost set bit
        int diff = xorSum & (-xorSum);

        int first = 0, second = 0;
        for (int x : a) {
            if ((x & diff) == 0) {
                first ^= x;
            } else {
                second ^= x;
            }
        }

        System.out.println(first + " " + second);
    }
}
