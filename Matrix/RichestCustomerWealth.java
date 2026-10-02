/*
LeetCode 1672 - Richest Customer Wealth

Question:
Find the maximum wealth (sum of money in all accounts) among all customers.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int max = 0;

        // Calculate sum of each row and track maximum wealth
        for (int i = 0; i < r; i++) {
            int sum = 0;

            for (int j = 0; j < c; j++) {
                sum += sc.nextInt();
            }

            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}
