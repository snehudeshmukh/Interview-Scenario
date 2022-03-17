package com.stringscenario;

public class PalindromeString {
	static void isPalindrome(String str) {
		String reverseStr= "";
		int length= str.length();
		for(int i=(length-1);i>=0;i--) {
			reverseStr=reverseStr + str.charAt(i);
			
		}
		System.out.println(reverseStr);
		if(str.equals(reverseStr)) {
			System.out.println(str+" "+ "is a Palindrome String");
		}
		else {
			System.out.println(str+" "+ "is not Palindrome String");
		}
	}
	
public static void main(String[] args) {
	isPalindrome("abba");
}
}
