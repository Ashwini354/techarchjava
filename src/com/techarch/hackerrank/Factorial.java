package com.techarch.hackerrank;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int a, res = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the a value");
		a = sc.nextInt();
		for (int i = a; i > 0; i--) {
			res = i * res;

		}
		System.out.println("The facorial of the number is:" + " " + res);
	}

}
