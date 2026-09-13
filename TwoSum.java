package com.dsa.easy;

import java.util.HashMap;

public class TwoSum {

	class Solution {

	    public int[] twoSum(int[] nums, int target) {
	            HashMap<Integer,Integer> hm= new HashMap<>();

	        for(int i=0;i<nums.length;i++)
	        {
	            int currNum=nums[i];
	            int reqNum=target-currNum;
	            if(hm.containsKey(reqNum))
	            {
	                return new int[]{hm.get(reqNum),i};
	            }
	            hm.put(currNum,i);
	        }
	        return new int[2];


	    }   

	    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
