package com.practice.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {

    	if(nums==null || nums.length==0)
    	{
    		return false;
    	}
    	Set<Integer> duplicate=new HashSet<Integer>();
    	for(int i:nums)
    	{
    		if(duplicate.contains(i) )
    		{
    			return true;
    		}
    		duplicate.add(i);
    	}
    	return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4,1};

        boolean result = containsDuplicate(nums);
        System.out.println(result);
    }
}