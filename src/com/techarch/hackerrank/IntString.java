package com.techarch.hackerrank;

import java.util.Scanner;

public class IntString {

	public static void main(String[] args) {
		int s;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		s = sc.nextInt();
		String res = Integer.toString(s);
		System.out.println("add 10");
		System.out.println(res + 10);
	}

}
