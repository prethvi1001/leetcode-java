/*
================================================================
               ALL STRING LEETCODE PROGRAMS IN ONE FILE
================================================================
Includes:
1. LeetCode 58   - Length of Last Word
2. LeetCode 1108 - Defanging an IP Address
3. LeetCode 771  - Jewels and Stones
4. LeetCode 387  - First Unique Character in a String
5. LeetCode 242  - Valid Anagram
6. LeetCode 125  - Valid Palindrome
7. LeetCode 28   - Find Index of First Occurrence in a String
8. LeetCode 1832 - Check if Sentence Is Pangram
9. LeetCode 205  - Isomorphic Strings
10. LeetCode 6   - Zigzag Conversion
*/

import java.util.*;

public class StringPrograms {

    // 1. LeetCode 58 - Length of Last Word
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        String[] words = s.split("\\s+");
        return words[words.length - 1].length();
    }

    // 2. LeetCode 1108 - Defanging an IP Address
    public static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

    // 3. LeetCode 771 - Jewels and Stones
    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (char c : stones.toCharArray()) {
            if (jewels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    // 4. LeetCode 387 - First Unique Character in a String
    public static int firstUniqChar(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    // 5. LeetCode 242 - Valid Anagram
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }

    // 6. LeetCode 125 - Valid Palindrome
    public static boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) l++;
            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) r--;
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    // 7. LeetCode 28 - Find Index of First Occurrence in a String
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    // 8. LeetCode 1832 - Check if Sentence Is Pangram
    public static boolean checkIfPangram(String sentence) {
        for (char c = 'a'; c <= 'z'; c++) {
            if (sentence.indexOf(c) == -1) return false;
        }
        return true;
    }

    // 9. LeetCode 205 - Isomorphic Strings
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) != t.indexOf(t.charAt(i))) return false;
        }
        return true;
    }

    // 10. LeetCode 6 - Zigzag Conversion
    public static String convertZigzag(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) rows[i] = new StringBuilder();

        int row = 0;
        boolean down = true;
        for (char c : s.toCharArray()) {
            rows[row].append(c);
            if (row == 0) down = true;
            else if (row == numRows - 1) down = false;
            row += down ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder sb : rows) result.append(sb);
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println("--- Testing String Programs ---");
        System.out.println("1. Length of Last Word: " + lengthOfLastWord("Hello World"));
        System.out.println("2. Defang IP Address: " + defangIPaddr("1.1.1.1"));
        System.out.println("3. Jewels and Stones: " + numJewelsInStones("aA", "aAAbbbb"));
        System.out.println("4. First Unique Char: " + firstUniqChar("leetcode"));
        System.out.println("5. Valid Anagram: " + isAnagram("anagram", "nagaram"));
        System.out.println("6. Valid Palindrome: " + isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println("7. Find First Occurrence: " + strStr("sadbutsad", "sad"));
        System.out.println("8. Check Pangram: " + checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
        System.out.println("9. Isomorphic Strings: " + isIsomorphic("egg", "add"));
        System.out.println("10. Zigzag Conversion: " + convertZigzag("PAYPALISHIRING", 3));
    }
}
