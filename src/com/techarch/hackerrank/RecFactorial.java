package com.techarch.hackerrank;

import java.util.Scanner;

public class RecFactorial {
	public int factorial(int a) {
		if (a == 0)
			return 1;
		else
			return (a * factorial(a - 1));

	}

	public static void main(String[] args) {
		int a, res = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the a value");
		a = sc.nextInt();
		RecFactorial r = new RecFactorial();
		System.out.println(" The factorial of given number is  " + r.factorial(a));

	}

}
