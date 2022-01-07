package com.techarch.hackerrank;

import java.util.Scanner;

public class MethodPlus {
	public static int Operator(int a, int b) {
		int res = a * b;
		return res;
	}

	public static float Operator(float a, float b) {
		Float res = (a / b);
		return res;
	}

	public static double Operator(int a, double b) {
		double res = a - b;
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int result = Operator(3, 6);
		float result1 = (float) Operator(2.0f, 6.0f);
		double result2 = Operator(20, 10.2);

		System.out.println("Multiply two number " + result);
		System.out.println();
		System.out.println("Divide two number " + result1);
		System.out.println();
		System.out.println("Subract two number " + result2);

	}

}
