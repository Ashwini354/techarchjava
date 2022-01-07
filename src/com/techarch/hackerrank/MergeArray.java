package com.techarch.hackerrank;

public class MergeArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 4, 6, 9, 10, 0, 0, 0, 0 };
		int b[] = { 3, 5, 7, 8 };
//		int j =0;
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] > b[j]) {
					temp = a[i];
					a[i] = b[j];
					b[j] = temp;
				}
				if (a[i] == 0) {
					temp = a[i];
					a[i] = b[j];
					b[j] = temp;
				}

			}

		}
		System.out.println(" two array merged is");
		for (int q : a)
			System.out.println(q);
	}

}
