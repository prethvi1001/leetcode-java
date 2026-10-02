/*
Part 1 - 1D Array Program 30
Title: Palindrome array
Input: n, then n integers
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        boolean p = true;
        for (int i = 0; i < n / 2; i++) {
            if (a[i] != a[n - 1 - i]) {
                p = false;
                break;
            }
        }
        System.out.println(p ? "Palindrome" : "Not Palindrome");
    }
}
