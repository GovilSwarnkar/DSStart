package com.ds.recursion;

public class Sum {

	public int iSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

	public int fSum(int n) {
		return (n * (n + 1)) / 2;
	}

	public int rSum(int n) {
		if (n == 0) {
			return 0;
		}
		return rSum(n - 1) + n;
	}

	public static void main(String[] args) {
		Sum sum = new Sum();
		System.out.println("iSum : " + sum.iSum(5));
		System.out.println("fSum : " + sum.fSum(5));
		System.out.println("rSum : " + sum.rSum(5));
	}
}
