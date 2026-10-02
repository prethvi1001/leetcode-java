/*
LeetCode 28 - Find Index of First Occurrence

Question:
Find the first occurrence of needle in haystack.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String haystack = sc.next();
        String needle = sc.next();

        // Return index using indexOf
        System.out.println(haystack.indexOf(needle));
    }
}
