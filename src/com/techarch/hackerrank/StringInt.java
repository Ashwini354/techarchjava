package com.techarch.hackerrank;

import java.util.Scanner;

public class StringInt {

	public static void main(String[] args) {

		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		s = sc.next();
		int res = Integer.parseInt(s);
		System.out.println(res);
		System.out.println("add 10" + " " + "the result is" + (res + 10));
	}

}
