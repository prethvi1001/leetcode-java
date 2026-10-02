/*
LeetCode 448 - Find All Numbers Disappeared in an Array

Question:
Find all numbers from 1 to n that do not appear in an array of size n.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        Set<Integer> present = new HashSet<>();

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            present.add(nums[i]);
        }

        List<Integer> missing = new ArrayList<>();

        // Check which numbers from 1 to n are missing in the set
        for (int i = 1; i <= n; i++) {
            if (!present.contains(i)) {
                missing.add(i);
            }
        }

        System.out.println(missing);
    }
}
