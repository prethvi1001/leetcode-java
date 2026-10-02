/*
LeetCode 217 - Contains Duplicate

Question:
Check whether an array contains duplicate elements.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            // If element is already in set, duplicate exists
            if (set.contains(x)) {
                System.out.println(true);
                return;
            }
            set.add(x);
        }

        System.out.println(false);
    }
}
