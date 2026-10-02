/*
================================================================
               ALL 1D ARRAY LEETCODE PROGRAMS IN ONE FILE
================================================================
Includes:
1. LeetCode 169  - Majority Element
2. LeetCode 217  - Contains Duplicate
3. LeetCode 1480 - Running Sum of 1D Array
4. LeetCode 66   - Plus One
5. LeetCode 1512 - Number of Good Pairs
6. LeetCode 268  - Missing Number
7. LeetCode 1365 - How Many Numbers Are Smaller Than Current
8. LeetCode 35   - Search Insert Position
9. LeetCode 704  - Binary Search
10. LeetCode 75  - Sort Colors
11. LeetCode 2574 - Left and Right Sum Differences
12. LeetCode 1475 - Final Prices With Special Discount
13. LeetCode 1389 - Create Target Array in Given Order
14. LeetCode 1431 - Kids With the Greatest Number of Candies
15. LeetCode 1920 - Build Array from Permutation
16. LeetCode 448  - Find All Numbers Disappeared in an Array
*/

import java.util.*;

public class Array1DPrograms {

    // 1. LeetCode 169 - Majority Element
    public static int majorityElement(int[] a) {
        Arrays.sort(a);
        return a[a.length / 2];
    }

    // 2. LeetCode 217 - Contains Duplicate
    public static boolean containsDuplicate(int[] a) {
        Set<Integer> set = new HashSet<>();
        for (int x : a) {
            if (set.contains(x)) return true;
            set.add(x);
        }
        return false;
    }

    // 3. LeetCode 1480 - Running Sum of 1D Array
    public static int[] runningSum(int[] a) {
        int[] res = a.clone();
        for (int i = 1; i < res.length; i++) {
            res[i] += res[i - 1];
        }
        return res;
    }

    // 4. LeetCode 66 - Plus One
    public static int[] plusOne(int[] a) {
        int n = a.length;
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] < 9) {
                a[i]++;
                return a;
            }
            a[i] = 0;
        }
        int[] b = new int[n + 1];
        b[0] = 1;
        return b;
    }

    // 5. LeetCode 1512 - Number of Good Pairs
    public static int numIdenticalPairs(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) count++;
            }
        }
        return count;
    }

    // 6. LeetCode 268 - Missing Number
    public static int missingNumber(int[] a) {
        int n = a.length;
        int sum = n * (n + 1) / 2;
        for (int x : a) sum -= x;
        return sum;
    }

    // 7. LeetCode 1365 - How Many Numbers Are Smaller Than Current
    public static int[] smallerNumbersThanCurrent(int[] a) {
        int[] ans = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] < a[i]) count++;
            }
            ans[i] = count;
        }
        return ans;
    }

    // 8. LeetCode 35 - Search Insert Position
    public static int searchInsert(int[] a, int target) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= target) return i;
        }
        return a.length;
    }

    // 9. LeetCode 704 - Binary Search
    public static int binarySearch(int[] a, int target) {
        int left = 0, right = a.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a[mid] == target) return mid;
            if (a[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    // 10. LeetCode 75 - Sort Colors
    public static void sortColors(int[] a) {
        Arrays.sort(a);
    }

    // 11. LeetCode 2574 - Left and Right Sum Differences
    public static int[] leftRightSumDifferences(int[] a) {
        int totalSum = 0;
        for (int x : a) totalSum += x;

        int leftSum = 0;
        int[] ans = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int rightSum = totalSum - leftSum - a[i];
            ans[i] = Math.abs(leftSum - rightSum);
            leftSum += a[i];
        }
        return ans;
    }

    // 12. LeetCode 1475 - Final Prices With Special Discount
    public static int[] finalPrices(int[] prices) {
        int[] result = prices.clone();
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] <= prices[i]) {
                    result[i] -= prices[j];
                    break;
                }
            }
        }
        return result;
    }

    // 13. LeetCode 1389 - Create Target Array in Given Order
    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }
        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) target[i] = list.get(i);
        return target;
    }

    // 14. LeetCode 1431 - Kids With the Greatest Number of Candies
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int c : candies) max = Math.max(max, c);
        List<Boolean> result = new ArrayList<>();
        for (int c : candies) result.add(c + extraCandies >= max);
        return result;
    }

    // 15. LeetCode 1920 - Build Array from Permutation
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    // 16. LeetCode 448 - Find All Numbers Disappeared in an Array
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int x : nums) set.add(x);
        List<Integer> missing = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) missing.add(i);
        }
        return missing;
    }

    public static void main(String[] args) {
        System.out.println("--- Testing 1D Array Programs ---");
        System.out.println("1. Majority Element: " + majorityElement(new int[]{3, 2, 3}));
        System.out.println("2. Contains Duplicate: " + containsDuplicate(new int[]{1, 2, 3, 1}));
        System.out.println("3. Running Sum: " + Arrays.toString(runningSum(new int[]{1, 2, 3, 4})));
        System.out.println("4. Plus One: " + Arrays.toString(plusOne(new int[]{1, 2, 3})));
        System.out.println("5. Good Pairs: " + numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3}));
        System.out.println("6. Missing Number: " + missingNumber(new int[]{3, 0, 1}));
        System.out.println("7. Smaller Numbers Than Current: " + Arrays.toString(smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3})));
        System.out.println("8. Search Insert Position: " + searchInsert(new int[]{1, 3, 5, 6}, 5));
        System.out.println("9. Binary Search Index: " + binarySearch(new int[]{-1, 0, 3, 5, 9, 12}, 9));
        System.out.println("11. Left & Right Sum Differences: " + Arrays.toString(leftRightSumDifferences(new int[]{10, 4, 8, 3})));
        System.out.println("12. Final Prices: " + Arrays.toString(finalPrices(new int[]{8, 4, 6, 2, 3})));
        System.out.println("14. Kids With Candies: " + kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3));
        System.out.println("15. Build Array: " + Arrays.toString(buildArray(new int[]{0, 2, 1, 5, 3, 4})));
        System.out.println("16. Disappeared Numbers: " + findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }
}
