package day6;

import java.util.*;

public class MajorityElement {
    public static int findMajorityElement(int[] nums) {
        int count = 0, candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++) {
        	nums[i]=sc.nextInt();
        }
        System.out.println(findMajorityElement(nums));
    }
}
