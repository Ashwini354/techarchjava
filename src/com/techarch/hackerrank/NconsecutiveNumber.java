package com.techarch.hackerrank;

import java.util.Scanner;

public class NconsecutiveNumber {
	public static void add(int a) {
		for (int i = 1; i < a; i++) {

			int res = i + (a - i);
			if (res == a) {
				System.out.println("the posiblle combination is " + res + "(" + (i) + "," + (a - i) + ")");

			}

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the N number");
		int a = sc.nextInt();
		add(a);
	}

}
