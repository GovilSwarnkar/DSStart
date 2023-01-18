package com.ds.recursion;

public class Fibonacci {

	public static int fibonacciRec(int n) {
		if (n <= 1) {
			return n;
		}
		return fibonacciRec(n - 2) + fibonacciRec(n - 1);
	}

	public static int fibonacciItr(int n) {
		if (n <= 1) {
			return n;
		}
		int a = 0, b = 1, t = 0, f = 0;
		while (n >= 2) {
			f = a + b;
			t = a;
			a = b;
			b = f;
			n--;
		}
		return f;
	}

	public static int fibonacciMemoization(int n) {
		int[] F = new int[n + 1];
		for (int i = 0; i < n + 1; i++) {
			F[i] = -1;
		}
		return fib(F, n);
	}

	private static int fib(int[] F, int n) {
		if (n <= 1) {
			F[n] = n;
		} else {
			if (F[n - 2] == -1) {
				F[n - 2] = fib(F, n - 2);
			}
			if (F[n - 1] == -1) {
				F[n - 1] = fib(F, n - 1);
			}
			F[n] = F[n - 2] + F[n - 1];
		}
		return F[n];
	}

	public static void main(String[] args) {
		System.out.println(fibonacciRec(20));
		System.out.println(fibonacciItr(20));
		System.out.println(fibonacciMemoization(6));
	}
}
