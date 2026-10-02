/*
LeetCode 1475 - Final Prices With a Special Discount in a Shop

Question:
Calculate final price after applying a discount of the next item whose price is <= current price.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] prices = new int[n];

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int[] result = prices.clone();

        // For each item, find the first subsequent item with price <= current price
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (prices[j] <= prices[i]) {
                    result[i] -= prices[j];
                    break;
                }
            }
        }

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
