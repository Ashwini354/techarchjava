package com.techarch.hackerrank;

import java.util.Scanner;

public class LowercaseConvert {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the lower case string");
		String s = sc.next();

		String res = s.toUpperCase();
		System.out.println("Converting lowercse to upper case");
		System.out.println(res);

	}
}
