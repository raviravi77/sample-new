package org.Array;

public class Array2 {
	public static void main(String[] args) {
		int b = 0;
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i <= a.length; i++) {
			b = i + b;
		}
		System.out.println("average is:");
		double c = ((b) / (a.length));
		System.out.println(c);

	}

}
