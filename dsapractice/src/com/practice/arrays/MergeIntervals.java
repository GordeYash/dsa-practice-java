package com.practice.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {
    	Arrays.sort(intervals,(a,b)->a[0]-b[0]);
    	List<int[]> result=new ArrayList<int[]>();
    	
    	int[] current=intervals[0];
    	
    	for(int i=1;i<intervals.length;i++)
    	{
    		if(intervals[i][0]<=current[1])
    		{
    			current[1]=Math.max(intervals[i][1],current[i]);
    		}else
    		{
    			result.add(current);
    			current=intervals[i];
    		}
    	}
    	return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {
            {1, 3},{2, 6},{8, 10},{15, 18}
        };

        int[][] result = merge(intervals);

        for (int[] interval : result) {
            System.out.println(interval[0] + " " + interval[1]);
        }
    }
}