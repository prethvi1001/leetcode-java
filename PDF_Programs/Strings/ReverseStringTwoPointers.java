/*
Part 3 - String Program 9
Title: Reverse a string (two pointers)
Input: one word
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] c = s.toCharArray();
        int l = 0, r = c.length - 1;
        while (l < r) {
            char t = c[l];
            c[l] = c[r];
            c[r] = t;
            l++;
            r--;
        }
        System.out.println(new String(c));
    }
}
