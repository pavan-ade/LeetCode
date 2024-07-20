package com.leet;

import java.util.HashSet;
import java.util.Set;

public class Q1684_Count_Consistents {
	/*
	 * 
	 * 
	 * 1684. Count the Number of Consistent Strings
	 * 
	 * You are given a string allowed consisting of distinct characters and an array
	 * of strings words. A string is consistent if all characters in the string
	 * appear in the string allowed.
	 * 
	 * Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"] 
	 * Output: 2
	 * Explanation: Strings "aaab" and "baa" are consistent since they only contain
	 * characters 'a' and 'b'.
	 */
	public static void main(String[] args) {
		String words[]= {"ad","bd","aaab","baa","badab"};
		String allowed = "ab";
		boolean notContain = false;
		int ans = 0;
		Set<Character> st= new HashSet<Character>();
		for(char ch: allowed.toCharArray()) {
			st.add(ch);
		}
		for(String word : words) {
			notContain = false;
			for(char letter : word.toCharArray()) {
				if(!st.contains(letter)) {
					notContain = true;
				}
			}
			if(!notContain) {
				System.out.println(word);
				ans++;
			}
		}
		
		
	}

}