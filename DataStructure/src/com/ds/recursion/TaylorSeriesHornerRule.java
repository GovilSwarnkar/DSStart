package com.ds.recursion;

public class TaylorSeriesHornerRule {

	public static double eLoop(int x, int n) {
		double s = 1;
		while (n > 0) {
			s = 1 + s * x / n;
			n--;
		}
		return s;
	}

	public static double eRec(int x, int n) {
		double s = 1;
		return e(s, x, n);
	}

	private static double e(double s, int x, int n) {
		if (n == 0) {
			return s;
		}
		s = 1 + s * x / n;
		return e(s, x, n - 1);
	}

	public static void main(String[] args) {
		System.out.println(eLoop(1, 10));
		System.out.println(eRec(1, 10));
		
		System.out.println(eLoop(2, 10));
		System.out.println(eRec(2, 10));
	}
}
