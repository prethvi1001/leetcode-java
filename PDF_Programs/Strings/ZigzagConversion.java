/*
Part 3 - String Program 13
Title: Zigzag conversion (LC 6)
Input: one word, then numRows
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int numRows = sc.nextInt();
        if (numRows == 1 || a.length() <= numRows) {
            System.out.println(a);
            return;
        }
        String[] b = new String[numRows];
        for (int i = 0; i < b.length; i++) b[i] = "";
        int cr = 0;
        boolean g = false;
        for (char ch : a.toCharArray()) {
            b[cr] += ch;
            if (cr == 0 || cr == numRows - 1) g = !g;
            cr += g ? 1 : -1;
        }
        String c = "";
        for (String d : b) c += d;
        System.out.println(c);
    }
}
