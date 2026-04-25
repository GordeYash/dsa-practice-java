package com.practice.arrays;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        // TODO: implement logic

        return new int[] {};
    }

    public static void main(String[] args) {

        TwoSum obj = new TwoSum();

        int[] nums = {};
        int target = 0;

        int[] result = obj.twoSum(nums, target);

        if (result.length == 2) {
            System.out.println("Indexes: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found");
        }
    }
}