/*
Part 1 - 1D Array Program 20
Title: Contains duplicate (LC 217) - HashSet
Input: n, then n integers
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        Set<Integer> s = new HashSet<>();
        for (int x : a) {
            if (s.contains(x)) {
                System.out.println("true");
                return;
            }
            s.add(x);
        }
        System.out.println("false");
    }
}
