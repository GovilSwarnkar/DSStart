package com.ds.array;

public class InsertionInSortedArray {

	public static void display(int[] a, int length) {
		if (length > 0) {
			for (int i = 0; i < length; i++) {
				System.out.print(a[i] + " ");
			}
		} else {
			System.out.println("Empty Array");
		}
	}

	public static int insertInSorted(int[] a, int length, int capacity, int key) {
		if (length >= capacity) {
			return length;
		}
		int i = length - 1;
		while ( i >= 0 && a[i] > key) {
			a[i + 1] = a[i];
			i--;
		}
		a[i + 1] = key;
		return length + 1;
	}

	public static void main(String[] args) {
		int[] a = new int[20];
		a[0] = 3;
		a[1] = 4;
		a[2] = 8;
		a[3] = 17;
		a[4] = 23;
		a[5] = 37;
		int length = 6, capacity = a.length;

		display(a, length);
		length = insertInSorted(a, length, capacity, 1);

		System.out.println("\nafter insertion");
		display(a, length);
	}
}
