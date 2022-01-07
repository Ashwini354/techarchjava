package com.techarch.hackerrank;

import java.util.Scanner;

public class BooleanABC {

	public static void main(String[] args) {
		boolean a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the a value");
		a = sc.nextBoolean();
		System.out.println("enter the a value");
		b = sc.nextBoolean();
		System.out.println("enter the a value");
		c = sc.nextBoolean();

		if ((a == b)) {
			System.out.println("  TRUE");

		} else {
			System.out.println(" FALSE ");
		}
		if (a == c) {
			System.out.println(" TRUE");
		} else {
			System.out.println("  FALSE");
		}
		if (b == a) {
			System.out.println("  TRUE");
		} else {
			System.out.println("  TRUE");
		}

	}

}
