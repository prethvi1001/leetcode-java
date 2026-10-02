/*
Part 3 - String Program 1
Title: Length of last word (LC 58)
Input: one line of text
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        a = a.trim();
        String[] c = a.split("\\s+");
        System.out.println(c[c.length - 1].length());
    }
}
