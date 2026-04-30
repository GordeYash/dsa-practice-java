package com.practice.arrays;

import java.util.*;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};

        int result = longestConsecutive(nums);
        System.out.println(result);
    }

    public static int longestConsecutive(int[] nums) {

        Set<Integer> seen=new HashSet<Integer>();
       
        if(nums.length==0 ||nums==null)
        	return 0;
        
        for(int i:nums)
        {
        	seen.add(i);
        	
        }
        int maxlength=0;
        for(int i:seen)
        {
        	if(!seen.contains(i-1))
        	{
        		int current=i;
        		int currentLength=1;
        		
        		while(seen.contains(current+1))
        		{
        			current++;
        			currentLength++;
        		}
        		maxlength=Math.max(maxlength, currentLength);
        	}
        }
        
        return maxlength; // placeholder
    }
}