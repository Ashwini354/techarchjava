package com.techarch.hackerrank;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of array");
		a = sc.nextInt();
		int arr[] = new int[a];
		System.out.println("enter the array are");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		boolean palindrome = true;
		for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
			if (arr[i] == arr[j]) {

			} else {
				palindrome = false;
			}
		}
		if (palindrome) {
			System.out.println("The given number is PALINDROME");
		} else {
			System.out.println("The given number" + " is  NOT PALINDROME");

		}
	}

}
