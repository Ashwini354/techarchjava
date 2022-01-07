package com.techarch.hackerrank;

import java.util.Scanner;

public class PaliString {

	public static void main(String[] args) {

		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		s = sc.next();
		String a = s.toLowerCase();
		char c[] = a.toCharArray();

		boolean palindrome = true;
		for (int i = 0, j = c.length - 1; i < c.length - 1; i++, j--) {
			if (c[i] == c[j]) {

			} else {
				palindrome = false;
			}
		}
		if (palindrome) {
			System.out.println("The given string is PALINDROME");
		} else {
			System.out.println("The given string" + " is  NOT PALINDROME");

		}
	}

}
