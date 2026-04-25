package com.practice.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        // TODO: implement logic
    	Map<Integer,Integer> data=new HashMap<Integer, Integer>();
    	for(int i=0;i<nums.length;i++)
    	{
    		int complement=target-nums[i];
    		//System.out.println("Complement :"+complement);
    		if(data.containsKey(complement))
    		{
    			//System.out.println("Value in Map :"+data.containsKey(complement));
    			return new int [] {data.get(complement),i};
    		}
    		//System.out.println("Puting data in map :"+complement+" : "+i);
    		data.put(nums[i], i);
    	}

        return new int[] {};
    }

    public static void main(String[] args) {

        TwoSum obj = new TwoSum();

        int[] nums = {1,8,7,4,0};
        int target = 5;

        int[] result = obj.twoSum(nums, target);

        if (result.length == 2) {
            System.out.println("Indexes: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found");
        }
    }
}