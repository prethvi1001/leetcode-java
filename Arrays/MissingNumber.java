/*
LeetCode 268 - Missing Number

Question:
Find the missing number from 0 to n.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        // Sum formula: n * (n + 1) / 2
        int sum = n * (n + 1) / 2;

        for (int i = 0; i < n; i++) {
            sum -= sc.nextInt();
        }

        // The remaining sum is the missing number
        System.out.println(sum);
    }
}
