/*
Part 3 - String Program 11
Title: Check if sentence is a pangram (LC 1832)
Input: one lowercase word/sentence (no spaces)
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (a.indexOf(ch) == -1) {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}
