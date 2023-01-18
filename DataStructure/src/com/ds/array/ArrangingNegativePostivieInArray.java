package com.ds.array;

public class ArrangingNegativePostivieInArray {

	public static void display(int[] a, int length) {
		if (length > 0) {
			for (int i = 0; i < length; i++) {
				System.out.print(a[i] + " ");
			}
		} else {
			System.out.println("Empty Array");
		}
	}

	public static void arrangingNegativeAndPositive(int[] a, int length) {
		int i = 0, j = length - 1;
		while (i < j) {
			while (a[i] < 0) {
				i++;
			}
			while (a[j] >= 0) {
				j--;
			}
			if (i < j) {
				swap(a, i, j);
			}
		}
	}

	private static void swap(int[] a, int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	public static void main(String[] args) {
		int[] a = {-6, 3, -8, 10, 5, -7, -9, 12, 4, 2};
		int length = 10;

		display(a, length);
		arrangingNegativeAndPositive(a, length);

		System.out.println("\nafter arranging");
		display(a, length);
	}
}
