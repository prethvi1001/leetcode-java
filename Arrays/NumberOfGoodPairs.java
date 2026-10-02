/*
LeetCode 1512 - Number of Good Pairs

Question:
Count pairs (i, j) where i < j and nums[i] == nums[j].
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

        int count = 0;

        // Check every pair (i, j) with i < j
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
