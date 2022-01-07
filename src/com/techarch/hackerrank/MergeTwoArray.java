package com.techarch.hackerrank;

import java.util.Scanner;

public class MergeTwoArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int temp = 0;
		System.out.println("enter the length of array A");
		int a = sc.nextInt();
		int arr[] = new int[a];
		System.out.println("the arrays are");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("enter the length of array B");
		int b = sc.nextInt();
		int array[] = new int[b];
		System.out.println("the arrays are");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();

		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (arr[i] > array[j]) {
					temp = arr[i];
					arr[i] = array[j];
					array[j] = temp;
				}
				if (arr[i] == 0) {
					temp = arr[i];
					arr[i] = array[j];
					array[j] = temp;
				}

			}

		}
		System.out.println(" two array merged is");
		for (int q : arr) {
			System.out.print(q + " ");
		}

	}

}
