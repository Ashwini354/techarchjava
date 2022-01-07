package com.techarch.hackerrank;

import java.util.Scanner;

public class SubSeequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		String s = sc.next();
		System.out.println("the charseequence is" + " " + s.subSequence(0, 5));

	}

}
