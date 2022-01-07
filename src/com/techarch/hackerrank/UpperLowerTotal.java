package com.techarch.hackerrank;

import java.util.Scanner;

public class UpperLowerTotal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int uCount = 0;
		int lCount = 0;
		int noCount = 0;
		System.out.println("enter the string");
		String s = sc.next();
		char c[] = s.toCharArray();
		String upperCase = "";
		String lowerCase = "";
		String number = "";
		for (int i = 0; i < c.length; i++) {
			if (c[i] >= 65 && c[i] <= 90) {
				upperCase = upperCase + c[i];
				uCount++;

			}

			else if (c[i] >= 97 && c[i] <= 122) {

				lowerCase = lowerCase + c[i];
				lCount++;
			}

			else if (c[i] >= 48 && c[i] <= 57) {
				number = number + c[i];
				noCount++;
			}

		}
		// count=1;
		System.out.println("UpperCase " + upperCase + "  count " + uCount);
		System.out.println("LowerCase " + lowerCase + " count " + lCount);
		System.out.println("Numbers " + number + " count " + noCount);

	}

}
