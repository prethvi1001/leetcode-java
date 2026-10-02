/*
LeetCode 137 - Single Number II

Question:
Given an integer array where every element appears three times except for one, find the single element.
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

        int ones = 0, twos = 0;

        // Bitwise tracking for counts modulo 3
        for (int x : a) {
            ones = (ones ^ x) & ~twos;
            twos = (twos ^ x) & ~ones;
        }

        System.out.println(ones);
    }
}
