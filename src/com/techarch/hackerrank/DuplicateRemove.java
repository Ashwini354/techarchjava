package com.techarch.hackerrank;

import java.util.Scanner;

public class DuplicateRemove {

	public static void main(String[] args) {

		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		s = sc.next();
		int i, j = 0;
		char c[] = s.toCharArray();
		System.out.println("the duplicate character are");
		for (i = 0; i < c.length; i++) {
			for (j = i + 1; j < c.length; j++) {
				if (c[i] == c[j]) {

					System.out.println(c[j]);

				}
			}
		}
	}
}
