package com.techarch.hackerrank;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class UniqueWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		String s = sc.nextLine();
		String a[] = s.split(" ");
		Map<String, Integer> uniqueMap = new HashMap<String, Integer>();
		for (int i = 0; i < a.length; i++) {
			if (uniqueMap.get(a[i]) != null) {
				int count = uniqueMap.get(a[i]) + 1;
				uniqueMap.put(a[i], count);
			} else {
				uniqueMap.put(a[i], 1);
			}
		}
		for (Entry<String, Integer> str : uniqueMap.entrySet()) {
			if (str.getValue() == 1)
				System.out.println(str.getKey());
		}

	}
}
