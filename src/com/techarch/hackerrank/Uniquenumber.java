package com.techarch.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class Uniquenumber {

	public static void main(String[] args) {
		int a, count = 1, res = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of array");
		a = sc.nextInt();
		int arr[] = new int[a];
		System.out.println("enter the array are");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		for (int i = 1; i <= arr.length; i++) {
			if (arr.length == i) {
				if (count == 1) {
					System.out.println("unique number " + arr[i - 1] + " of count " + count);
				} else {
					System.out.println("Non unique number" + arr[i - 1] + " of count " + count);
				}
			} else {
				if (arr[i - 1] != arr[i]) {
					if (count == 1) {
						System.out.println("unique number " + arr[i - 1] + " of count " + count);
					} else {
						System.out.println("Non unique number " + arr[i - 1] + " of count " + count);
						count = 1;
//						System.out.println(arr[i - 1]);
					}
				} else {
					count++;
				}
			}
		}
	}

}
