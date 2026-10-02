/*
LeetCode 205 - Isomorphic Strings

Question:
Check whether two strings are isomorphic.
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

        // Match first occurrences of corresponding characters
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) != t.indexOf(t.charAt(i))) {
                System.out.println(false);
                return;
            }
        }

        System.out.println(true);
    }
}
