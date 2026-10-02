/*
Part 3 - String Program 8
Title: Defanging an IP address (LC 1108)
Input: one IP address
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(a.replace(".", "[.]"));
    }
}
