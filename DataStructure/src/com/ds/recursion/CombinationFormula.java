package com.ds.recursion;

public class CombinationFormula {

	public int c(int n, int r ) {
		Factorial fact = new Factorial();
		return fact.iFactactorial(n) / (fact.iFactactorial(r) * fact.iFactactorial(n - r));
	}
	
	public int cUsingPascalTriagnle(int n, int r) {
		if(r ==0 ||  n == r) {
			return 1;
		}
		return cUsingPascalTriagnle(n - 1, r -1) + cUsingPascalTriagnle(n - 1, r);
	}
	public static void main(String[] args) {
		CombinationFormula c = new CombinationFormula();
		System.out.println(c.c(12, 2));
		System.out.println(c.cUsingPascalTriagnle(1222, 2));
	}
}
