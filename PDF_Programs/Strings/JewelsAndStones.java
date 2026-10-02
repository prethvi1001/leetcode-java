/*
Part 3 - String Program 7
Title: Jewels and stones (LC 771)
Input: jewels, then stones (two words)
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jewels = sc.next(), stones = sc.next();
        boolean[] a = new boolean[128];
        for (char j : jewels.toCharArray()) {
            a[j] = true;
        }
        int c = 0;
        for (char s : stones.toCharArray()) {
            if (a[s]) c++;
        }
        System.out.println(c);
    }
}
