package com.techarch.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class OcurenceAllCount {

	public static void main(String[] args) {
		int count = 1;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		String s = sc.next();
		char c[] = s.toCharArray();
		Arrays.sort(c);
		System.out.println(c);
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (j == c.length - 1) {
					System.out.println(c[i] + "number of occurence is " + count);
					break;
				}
				if (c[i] == c[j]) {
					count++;
//					System.out.println(count++);
				} else {
					System.out.println(c[i] + "number of occurence is " + count);
					i = j - 1;
					break;
				}
			}
			count = 1;
		}

	}

}
