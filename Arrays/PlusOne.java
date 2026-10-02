/*
LeetCode 66 - Plus One

Question:
Add one to an integer represented by an array of digits.
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

        // Add 1 starting from the least significant digit
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] < 9) {
                a[i]++;
                for (int x : a) {
                    System.out.print(x + " ");
                }
                return;
            }
            a[i] = 0;
        }

        // If all digits were 9, create a new array with leading 1
        int[] b = new int[n + 1];
        b[0] = 1;

        for (int x : b) {
            System.out.print(x + " ");
        }
    }
}
