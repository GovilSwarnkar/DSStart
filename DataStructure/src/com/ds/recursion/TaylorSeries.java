package com.ds.recursion;

public class TaylorSeries {

	private double p = 1, f = 1;

	public double e(int x, int n) {
		double r = 0;
		if (n == 0) {
			return 1;
		}
		r = e(x, n - 1);
		p *= x;
		f *= n;
		return r + p / f;
	}

	public static void main(String[] args) {
		System.out.printf("%1f", new TaylorSeries().e(1, 10));
	}
}
