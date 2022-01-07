package com.techarch.hackerrank;

import java.util.Scanner;

public class RemoveGivenChar {
	public static void removKey(char key, String s) {

		for (int i = 0; i < s.length(); i++) {
			if (key != s.charAt(i)) {
				System.out.print(s.charAt(i));

			}

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the  string");
		String s = sc.next();
		System.out.println("enter the  key to remove");
		String key = sc.next();
		removKey(key.charAt(0), s);

	}

}
