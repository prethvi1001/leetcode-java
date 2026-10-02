/*
Part 1 - 1D Array Program 8
Title: Second largest element
Input: n, then n integers
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int largest = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] > largest) {
                second = largest;
                largest = a[i];
            } else if (a[i] > second && a[i] != largest) {
                second = a[i];
            }
        }
        System.out.println(second);
    }
}
