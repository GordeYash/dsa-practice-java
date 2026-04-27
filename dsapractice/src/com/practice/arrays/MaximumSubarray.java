package com.practice.arrays;

public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {
    	int max_sum=nums[0];
    	int current_sum=nums[0];
    	
    	for(int i=1;i<nums.length;i++)
    	{
    		current_sum=Math.max(nums[i], current_sum+nums[i]);
    		max_sum=Math.max(max_sum, current_sum);
    	}
    	
    	return max_sum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = maxSubArray(nums);
        System.out.println("\n"+result);
    }
}