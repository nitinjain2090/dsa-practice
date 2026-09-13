package com.dsa.easy;

public class Palindromre {

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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
