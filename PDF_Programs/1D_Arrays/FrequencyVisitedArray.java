/*
Part 1 - 1D Array Program 17
Title: Frequency of each element (visited array)
Input: n, then n integers
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (a[i] == a[j]) {
                        count++;
                        visited[j] = true;
                    }
                }
                System.out.println("Freq of " + a[i] + " = " + count);
            }
        }
    }
}
