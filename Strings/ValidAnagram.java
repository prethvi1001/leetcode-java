/*
LeetCode 242 - Valid Anagram

Question:
Check whether two strings are anagrams.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        if (s.length() != t.length()) {
            System.out.println(false);
            return;
        }

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        // Sort both arrays and check equality
        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println(Arrays.equals(a, b));
    }
}
