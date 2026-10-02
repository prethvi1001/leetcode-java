/*
LeetCode 1365 - How Many Numbers Are Smaller Than the Current Number

Question:
For every element, count how many numbers are smaller than it.
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

        // Count elements smaller than a[i]
        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (a[j] < a[i]) {
                    count++;
                }
            }

            System.out.print(count + " ");
        }
    }
}
