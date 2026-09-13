package com.dsa.easy;

import java.util.HashMap;

public class Solution {
	public boolean isPalindrome(String s) {

		if (s.trim().length() == 1 || s.trim().equals(""))
			return true;
		StringBuilder sb = new StringBuilder();
		for (char c : s.toCharArray()) {
			if (Character.isLetterOrDigit(c))
				sb.append(Character.toLowerCase(c));
		}

		for (int i = 0; i < sb.length() / 2; i++) {
			if (Character.compare(sb.charAt(i), sb.charAt((sb.length() - 1 - i))) != 0) {
				return false;
			}

		}
		return true;
	}
	
	/*
	 * public static boolean isPalindromePreferredWay(String s) {
	 * 
	 * int left=0;int right=s.length()-1;
	 * 
	 * while(left<right) { while(left<right &&
	 * !Character.isLetterOrDigit(s.charAt(left))) left++; while(left<right &&
	 * !Character.isLetterOrDigit(s.charAt(right))) right--;
	 * 
	 * if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(
	 * right))) return false;
	 * 
	 * left++; right--;
	 * 
	 * } return true; }
	 */
	
		    public static boolean isAnagram(String s, String t) {
		        //check if s and t having same characters if same then true else false
		        if(s==null || t== null || s.length()!=t.length())
		            return false;
		        
		        HashMap<Character,Integer> hm= new HashMap<>();//"anagram","nagaram"=a=1,n-1

		        for(int i=0;i<s.length();i++)
		        {
		            int sVal=hm.get(s.charAt(i))==null?1:(hm.get(s.charAt(i)))+1;
		            hm.put(s.charAt(i),sVal);
		            
		            int tVal=hm.get(t.charAt(i))==null?-1:(hm.get(t.charAt(i)))-1;		            
		            hm.put(t.charAt(i),tVal);
		        }

		        for(Character k:hm.keySet())
		            {
		                if(hm.get(k)!=0)
		                    return false;
		                
		            }
		        return true;


		    }
		
	
	public static void main(String args[])
	{
		//System.out.println( isPalindromePreferredWay("A man, a plan, a canal: Panama"));
		System.out.println(isAnagram("anagram","nagaram"));
	}
}
