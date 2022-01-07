package com.techarch.hackerrank;

public class Algorithum {

	public static void main(String[] args) {
		int a[] = { 3, 2, 4, 7, 0, 3, 1, 5, 8, 4 };
		for (int i = 0; i < a.length; i++) {
			// for(int k=2;k<a.length-1;k++) {
			if (i + 2 < a.length) {
				int temp = a[i];
				a[i] = a[i + 2];
				a[i + 2] = temp;
				i = i + 2;
			}
		}

		System.out.println("the pattern is");
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + " ");
		}
	}

}
