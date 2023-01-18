package com.ds.array;

public class SetOperationsOnSortedArrays {

	public static void display(int[] a, int length) {
		if (length > 0) {
			for (int i = 0; i < length; i++) {
				System.out.print(a[i] + " ");
			}
		} else {
			System.out.println("Empty Array");
		}
	}

	public static void union(int[] a, int n, int[] b, int m, int[] c) {
		int i = 0, j = 0, k = 0;
		while (i < n && j < m) {
			if (a[i] < b[j]) {
				c[k++] = a[i++];
			} else if (a[i] > b[j]) {
				c[k++] = b[j++];
			} else {
				c[k++] = a[i++];
				j++;
			}
		}
		while (i < n) {
			c[k++] = a[i++];
		}
		while (j < m) {
			c[k++] = b[j++];
		}
	}

	public static void intersection(int[] a, int n, int[] b, int m, int[] c) {
		int i = 0, j = 0, k = 0;
		while (i < n && j < m) {
			if (a[i] == b[j]) {
				c[k++] = a[i++];
			} else if (a[i] < b[j]) {
				i++;
			} else {
				j++;
			}
		}
	}

	public static void main(String[] args) {
		int[] a = { 2, 6, 8, 16, 26 };
		int b[] = { 3, 6, 16, 18, 20 };
		int n = a.length, m = b.length;
		int l = n + m - 2;
		int[] c = new int[l];
		
		System.out.println("Union");
		union(a, n, b, m, c);
		display(c, l);
		
		System.out.println("\nIntersection");
		intersection(a, n, b, m, c);
		display(c, l);
	}
}
