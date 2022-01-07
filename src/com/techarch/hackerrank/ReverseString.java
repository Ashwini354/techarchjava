package com.techarch.hackerrank;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		String s = sc.nextLine();
		String s1[] = s.split(" ");

		for (String key : s1) {
			for (int i = key.length() - 1; i >= 0; i--) {
				System.out.print(key.charAt(i));
			}
			System.out.print(" ");
		}

	}

}
