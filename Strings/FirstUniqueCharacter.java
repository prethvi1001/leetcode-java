/*
LeetCode 387 - First Unique Character in a String

Question:
Find the index of the first non-repeating character.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int[] count = new int[26];

        // Store character frequencies
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        // Find first character with count == 1
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(-1);
    }
}
