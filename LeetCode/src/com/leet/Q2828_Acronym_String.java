package com.leet;

import java.util.ArrayList;
import java.util.List;

public class Q2828_Acronym_String {

	public static void main(String[] args) {
		List<String> words=new ArrayList<String>();
		words.add("alice");
		words.add("bob");
		words.add("charlie");
		String s="abc";
		boolean acronym = isAcronym(words, s);
		
		if(acronym == true)
			System.out.println("Test Passed");

	}

	public static boolean isAcronym(List<String> words, String s) {
		int noOf = 0;
		if (words.size() == s.length()) {
			for (int i = 0; i < s.length(); i++) {
				String word = words.get(i);
				if (word.charAt(0) == s.charAt(i))
					noOf++;
			}
			if (noOf == s.length()) {
				return true;
			}
		}
		return false;
	}
}
