package com.stringscenario;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number:");
	int no=sc.nextInt();
	int originalNo=no;
	int reverseNo=0,reminder;
	while(originalNo!=0) {
		reminder=originalNo%10;
		reverseNo=reverseNo*10+reminder;
		originalNo=originalNo/10;
		
	}
	if(no==reverseNo) {
		System.out.println(no+ "is palindrome");
	}
	else {
	
	System.out.println(no+ "is not Palindrome");
		
	}
	}

}
