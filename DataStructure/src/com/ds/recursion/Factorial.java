package com.ds.recursion;

public class Factorial {

	public int rFactorial(int n) {
		if (n < 0) {
			throw new RuntimeException("Negative number is not applicable to find factorial");
		}
		return rFact(n);
	}

	private int rFact(int n) {

		if (n == 0) {
			return 1;
		}
		return rFact(n - 1) * n;
	}

	public int iFactactorial(int n) {
		if (n < 0) {
			throw new RuntimeException("Negative number is not applicable to find factorial");
		}
		int fact = 1;
		for (int i = n; i > 0; i--) {
			fact *= i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		Factorial fact = new Factorial();
		System.out.println("rFact : " + fact.rFactorial(6));
		System.out.println("iFact : " + fact.iFactactorial(6));
	}
}
