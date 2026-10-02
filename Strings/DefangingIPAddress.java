/*
LeetCode 1108 - Defanging an IP Address

Question:
Replace every . in an IP address with [.].
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ip = sc.next();
        // Replace '.' with '[.]'
        System.out.println(ip.replace(".", "[.]"));
    }
}
