/*
LeetCode 1389 - Create Target Array in the Given Order

Question:
Create a target array by inserting nums[i] at index index[i].
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        int[] index = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            index[i] = sc.nextInt();
        }

        List<Integer> list = new ArrayList<>();

        // Insert numbers into list at specified index positions
        for (int i = 0; i < n; i++) {
            list.add(index[i], nums[i]);
        }

        for (int x : list) {
            System.out.print(x + " ");
        }
    }
}
