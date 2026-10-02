/*
LeetCode 58 - Length of Last Word

Question:
Find the length of the last word in a string.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().trim();
        // Split string by whitespace and return last word length
        String[] words = s.split("\\s+");

        System.out.println(words[words.length - 1].length());
    }
}
