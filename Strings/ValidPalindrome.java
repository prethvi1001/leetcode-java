/*
LeetCode 125 - Valid Palindrome

Question:
Check whether a string is a palindrome after ignoring non-alphanumeric characters and case.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int l = 0, r = s.length() - 1;

        // Two pointer technique ignoring non-alphanumeric characters
        while (l < r) {
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            }

            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }

            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                System.out.println(false);
                return;
            }

            l++;
            r--;
        }

        System.out.println(true);
    }
}
