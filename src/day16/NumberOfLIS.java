package day16;

import java.util.*;

public class NumberOfLIS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = new NumberOfLIS().findNumberOfLIS(nums);
        System.out.println("Number of Longest Increasing Subsequences: " + result);
    }

    public int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        int[] lengths = new int[n]; // lengths[i] = length of LIS ending at i
        int[] counts = new int[n];  // counts[i] = number of LIS ending at i

        Arrays.fill(lengths, 1);
        Arrays.fill(counts, 1);

        int maxLen = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    if (lengths[j] + 1 > lengths[i]) {
                        lengths[i] = lengths[j] + 1;
                        counts[i] = counts[j];
                    } else if (lengths[j] + 1 == lengths[i]) {
                        counts[i] += counts[j];
                    }
                }
            }
            maxLen = Math.max(maxLen, lengths[i]);
        }

        int total = 0;
        for (int i = 0; i < n; i++)
            if (lengths[i] == maxLen)
                total += counts[i];

        return total;
    }
}
