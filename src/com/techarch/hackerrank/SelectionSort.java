package com.techarch.hackerrank;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of element");
		int a[] = new int[5];
		System.out.println("enter the number");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();

		}
		for (int j = 0; j < a.length - 1; j++) {
			for (int k = j + 1; k < a.length - 1; k++) {
				if (a[j] > a[k]) {
					int temp = a[k];
					a[k] = a[j];
					a[j] = temp;

				}
			}
		}
		System.out.println("the selection sort is");
		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);
		}

	}

}
