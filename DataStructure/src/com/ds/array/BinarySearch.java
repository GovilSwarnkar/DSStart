package com.ds.array;

import java.util.Arrays;
import java.util.function.Supplier;

public class BinarySearch {

	private static Supplier<BinarySearch> supplierBinarySearch = BinarySearch::new;

	public int binarySearch(int[] a, int key) {
		int l = 0, h = a.length - 1, mid;
		while (l <= h) {
			mid = (l + h) / 2;
			if (key == a[mid]) {
				return mid;
			} else if (key < a[mid]) {
				h = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return -1;
	}

	public int recBinerySearch(int[] a, int key) {
		int l = 0, h = a.length - 1;
		return supplierBinarySearch.get().rBinarySearch(a, l, h, key);
	}

	private int rBinarySearch(int[] a, int l, int h, int key) {
		int mid;
		if (l <= h) {
			mid = (l + h) / 2;
			if (key == a[mid]) {
				return mid;
			} else if (key < a[mid]) {
				return rBinarySearch(a, l, mid - 1, key);
			} else {
				return rBinarySearch(a, mid + 1, h, key);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] a = { 2, 4, 5, 7, 9, 11 };

		Arrays.stream(a).forEach(x -> System.out.print(x + " "));

		System.out.println("\nItrative :: key at index: " + supplierBinarySearch.get().binarySearch(a, 7));

		System.out.println("Recurisive :: key at index: " + supplierBinarySearch.get().recBinerySearch(a, 9));
	}
	
	//best case time complexity - O(1)
	//worste case time complexity - O(logn) : base 2
}
