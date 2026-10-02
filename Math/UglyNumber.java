/*
LeetCode 263 - Ugly Number

Question:
Check whether a number's prime factors only include 2, 3, and 5.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println(false);
            return;
        }

        // Divide by 2, 3, and 5 as much as possible
        int[] factors = {2, 3, 5};
        for (int f : factors) {
            while (n % f == 0) {
                n /= f;
            }
        }

        // If reduced to 1, it is an ugly number
        System.out.println(n == 1);
    }
}
