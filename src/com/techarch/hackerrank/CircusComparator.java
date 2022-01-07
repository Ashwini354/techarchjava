package com.techarch.hackerrank;

import java.util.Comparator;

public class CircusComparator implements Comparator<Dimensions> {

	@Override
	public int compare(Dimensions o1, Dimensions o2) {
		if (o1.getHeight() > o2.getHeight() && o1.getWidth() > o2.getWidth()) {
			return 1;

		} else if (o1.getHeight() < o2.getHeight() && o1.getWidth() < o2.getWidth()) {
			return -1;
		} else {

			return 0;
		}

	}
}
