package com.techarch.hackerrank;

import java.util.Scanner;

public class LongPalindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the a String");
		String a = sc.nextLine();
		String arr[] = a.split(" ");
		String LongPali = "null";
		for (int i = 0; i < arr.length; i++) {
			boolean palindrome = true;
			char c[] = arr[i].toCharArray();
			for (int j = 0, k = c.length - 1; j < c.length; j++, k--) {
				if (c[j] != c[k]) {
					palindrome = false;

				}

				if (palindrome) {
					if (LongPali == null) {
						LongPali = arr[i];
					} else if (LongPali.length() < arr[i].length()) {
						LongPali = arr[i];

					}
				}

			}
		}
		System.out.println("The Longest Palindrome is " + LongPali);

	}

}
