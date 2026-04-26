package com.practice.arrays;

public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {
    	int minPrice=Integer.MAX_VALUE;
    	int maxProfit=0;
    	if(prices==null || prices.length==0)
    	{
    		return -1;
    	}
    	for(int i=0;i<prices.length;i++)
    	{
    		
    		minPrice=Math.min(minPrice, prices[i]);
    		int profit=prices[i]-minPrice;
    		maxProfit=Math.max(maxProfit, profit);
    	}
    	return maxProfit;

    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        int result = maxProfit(prices);
        System.out.println(result);
    }
}