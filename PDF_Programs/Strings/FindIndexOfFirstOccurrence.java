/*
Part 3 - String Program 10
Title: Find index of first occurrence (LC 28)
Input: haystack, then needle
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next(), s2 = sc.next();
        System.out.println(s1.indexOf(s2));
    }
}
