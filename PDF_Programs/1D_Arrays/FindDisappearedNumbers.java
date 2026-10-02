/*
Part 1 - 1D Array Program 39
Title: Find all numbers disappeared in an array (LC 448)
Input: n, n values in range 1..n
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int index = Math.abs(a[i]) - 1;
            if (a[index] > 0) a[index] = -a[index];
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (a[i] > 0) res.add(i + 1);
        }
        System.out.println(res);
    }
}
