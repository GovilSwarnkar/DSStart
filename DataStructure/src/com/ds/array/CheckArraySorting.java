package com.ds.array;

public class CheckArraySorting {

	public static void display(int[] a, int length) {
		if (length > 0) {
			for (int i = 0; i < length; i++) {
				System.out.print(a[i] + " ");
			}
		} else {
			System.out.println("Empty Array");
		}
	}

	public static boolean isSorted(int[] a, int length) {
		for (int i = 0; i < length - 1; i++) {
			if (a[i] > a[i + 1]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] a = new int[20];
		a[0] = 3;
		a[1] = 4;
		a[2] = 8;
		a[3] = 17;
		a[4] = 23;
		a[5] = 37;
		int length = 6;

		display(a, length);
		boolean check = isSorted(a, length);

		if (check) {
			System.out.println("\nArray is sorted");
		} else {
			System.out.println("\nArray is not sorted");
		}
	}
}
