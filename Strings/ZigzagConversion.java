/*
LeetCode 6 - Zigzag Conversion

Question:
Convert a string into a zigzag pattern using the given number of rows.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int rows = sc.nextInt();

        if (rows == 1 || s.length() <= rows) {
            System.out.println(s);
            return;
        }

        StringBuilder[] a = new StringBuilder[rows];

        for (int i = 0; i < rows; i++) {
            a[i] = new StringBuilder();
        }

        int row = 0;
        boolean down = true;

        // Populate row builders by moving down then up
        for (char c : s.toCharArray()) {
            a[row].append(c);

            if (row == 0) {
                down = true;
            } else if (row == rows - 1) {
                down = false;
            }

            row += down ? 1 : -1;
        }

        StringBuilder ans = new StringBuilder();

        for (StringBuilder x : a) {
            ans.append(x);
        }

        System.out.println(ans);
    }
}
