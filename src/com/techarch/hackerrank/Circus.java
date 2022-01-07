package com.techarch.hackerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Circus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dimensions c[] = new Dimensions[6];
		for (int i = 0; i < c.length; i++) {
			Dimensions cir = new Dimensions();
			System.out.println("enter the height");
			cir.height = sc.nextInt();
			System.out.println("enter the width");
			cir.width = sc.nextInt();
			c[i] = cir;

		}
		List<Dimensions> cList = Arrays.asList(c);
		Collections.sort(cList, new CircusComparator());
		for (Dimensions o : cList) {
			System.out.println("  length  " + o.height + "  width  " + o.width);

		}

	}

}
