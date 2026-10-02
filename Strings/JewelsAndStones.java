/*
LeetCode 771 - Jewels and Stones

Question:
Count how many stones are jewels.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String jewels = sc.next();
        String stones = sc.next();

        int count = 0;

        // Check if character from stones exists in jewels
        for (char c : stones.toCharArray()) {
            if (jewels.indexOf(c) != -1) {
                count++;
            }
        }

        System.out.println(count);
    }
}
