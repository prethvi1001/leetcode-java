/*
LeetCode 1431 - Kids With the Greatest Number of Candies

Question:
Check if giving extraCandies to a kid makes them have the maximum candies among all kids.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] candies = new int[n];
        int maxCandies = 0;

        for (int i = 0; i < n; i++) {
            candies[i] = sc.nextInt();
            maxCandies = Math.max(maxCandies, candies[i]);
        }

        int extraCandies = sc.nextInt();
        List<Boolean> result = new ArrayList<>();

        // Check if candies[i] + extraCandies >= maxCandies
        for (int i = 0; i < n; i++) {
            result.add(candies[i] + extraCandies >= maxCandies);
        }

        System.out.println(result);
    }
}
