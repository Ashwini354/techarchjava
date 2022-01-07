package com.techarch.hackerrank;

import java.util.Scanner;

;

public class Bsearch {
	int min = 0;

	public void bin(int a[], int key, int max) {

		while (min <= max) {
			int avg = min + (max - 1) / 2;
			if (key == a[avg]) {
				System.out.println("present" + avg);
				break;
			} else if (a[avg] < key) {
				min = avg + 1;

			} else if (a[avg] > key) {
				max = avg - 1;
			}

		}
	}

	public static void main(String[] args) {
		Bsearch b = new Bsearch();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of the array");
		int l = sc.nextInt();
		int a[] = new int[l];
		System.out.println("enter the number");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("enter the key");
		int key = sc.nextInt();
		int max = a.length - 1;
		b.bin(a, key, max);

	}
}
