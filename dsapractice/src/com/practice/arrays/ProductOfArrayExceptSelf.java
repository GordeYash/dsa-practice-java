package com.practice.arrays;

import java.io.Console;

public class ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {

    	int[] product=new int[nums.length];
    	int current=0;
    	int count=1;
    	for(int i=0;i<nums.length;i++) {
    		current=nums[i];
    		System.out.println("Current -> "+current);
    		for(int j=0;j<nums.length;j++)
    		{
    			if(nums[j]==current)
    				continue;
    			count=count*nums[j];
    			System.out.println("Count -> "+count);
    		}
    		product[i]=count;
    		count=1;
    	}
    	return product;
    	}

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        int[] result = productExceptSelf(nums);

        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}