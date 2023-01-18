package com.ds.recursion;

public class Power {

	public int rPower(int m, int n) {
		if (n == 0) {
			return 1;
		}
		return rPower(m, n - 1) * m;
	}

	public int rPowerEfficient(int m, int n) {
		if (n == 0) {
			return 1;
		}
		if (n % 2 == 0) {
			return rPowerEfficient(m * m, n / 2);
		}
		return m * rPowerEfficient(m * m, (n - 1) / 2);
	}

	public static void main(String[] args) {
		Power power = new Power();
		System.out.println("rPower(2, 5) : " + power.rPower(2, 5));
		System.out.println("rPowerEfficient(2, 5) : " + power.rPowerEfficient(2, 5));
	}
}
