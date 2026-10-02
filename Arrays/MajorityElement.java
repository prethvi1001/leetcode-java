/*
LeetCode 169 - Majority Element

Question:
Find the element that appears more than n/2 times in an array.
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

        // Sorting the array puts the majority element at index n/2
        // because it appears more than n/2 times.
        Arrays.sort(a);
        System.out.println(a[n / 2]);
    }
}
