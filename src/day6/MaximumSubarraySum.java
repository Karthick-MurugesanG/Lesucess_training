package day6;

import java.util.Scanner;

public class MaximumSubarraySum {
  public static int maxSubArray(int[] nums) {
        int maxSoFar = nums[0], maxEndingHere = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++) {
        	nums[i]=sc.nextInt();
        }
        System.out.println(maxSubArray(nums));
    }
}
