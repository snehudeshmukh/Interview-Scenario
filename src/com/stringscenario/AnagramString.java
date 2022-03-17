package com.stringscenario;

import java.util.Arrays;

public class AnagramString {
	 static void isAnagram(String s1, String s2)
	 {
	s1= s1.toUpperCase();
	s2= s2.toUpperCase();
	if(s1.length()==s2.length()) {
	char [] arr1=s1.toCharArray();
	char [] arr2= s2.toCharArray();
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	
	if (Arrays.equals(arr1,arr2)) {
		System.out.println(s1 + " "+   "and " + s2+" " +"are Anagram");
	}
	else {
		System.out.println(s1 +" " + "and " + s2+" " + "are not Anagram");
	}
	}
	else {
		System.out.println(s1 +" " + "and " + s2+" "+ "are not Anagram");
	}
	
	 }
	public static void main(String[] args) {
		isAnagram("Listen","silent");
		}
		
	
	}	

