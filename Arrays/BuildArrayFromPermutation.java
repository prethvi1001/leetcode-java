/*
LeetCode 1920 - Build Array from Permutation

Question:
Build an array ans of same length where ans[i] = nums[nums[i]].
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] ans = new int[n];

        // Build array using the permutation mapping
        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}
