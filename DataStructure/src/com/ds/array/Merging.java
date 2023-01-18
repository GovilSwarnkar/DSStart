package com.ds.array;

public class Merging {

	public static void display(int[] a, int length) {
		if (length > 0) {
			for (int i = 0; i < length; i++) {
				System.out.print(a[i] + " ");
			}
		} else {
			System.out.println("Empty Array");
		}
	}

	public static void merge(int[] a, int n, int[] b, int m, int[] c) {
		int i = 0, j = 0, k = 0;
		while (i < n && j < m) {
			if (a[i] < b[j]) {
				c[k++] = a[i++];
			} else {
				c[k++] = b[j++];
			}
		}
		while (i < n) {
			c[k++] = a[i++];
		}
		while (j < m) {
			c[k++] = b[j++];
		}
	}

	public static void main(String[] args) {
		int[] a = { 2, 6, 8, 16, 26 };
		int b[] = { 4, 7, 18, 23 };
		int n = a.length, m = b.length;
		int l = n + m;
		int[] c = new int[l];
		merge(a, n, b, m, c);
		display(c, l);
	}
}
