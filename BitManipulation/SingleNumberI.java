/*
LeetCode 136 - Single Number I

Question:
Given a non-empty array of integers where every element appears twice except for one, find that single element.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ans = 0;

        // XORing all elements leaves only the single unique element
        for (int i = 0; i < n; i++) {
            ans ^= sc.nextInt();
        }

        System.out.println(ans);
    }
}
