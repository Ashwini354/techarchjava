package com.techarch.hackerrank;

import java.util.Scanner;

public class SortInteger {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of array");
		a = sc.nextInt();
		int arr[] = new int[a];
		System.out.println("the unsorted array are");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}
		System.out.println("The sorted array are");
		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
		}
	}

}
