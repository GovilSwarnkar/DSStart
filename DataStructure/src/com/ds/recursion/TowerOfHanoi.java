package com.ds.recursion;

public class TowerOfHanoi {

	private static int totalSteps = 0;
	
	public static void TOH(int n, char x, char y, char z) {
		if(n > 1) {  // n >= 2
			TOH(n -1, x, z, y);
			System.out.printf("%c -> %c\n", x, y);
			TOH(n - 1, z, y, x);
		}else if(n == 1) {
			System.out.printf("%c -> %c\n", x, y);
		}
		totalSteps++;
	}
	public static void main(String[] args) {
		TOH(3, 'x', 'y',  'z');
		System.out.println("Total steps : " + totalSteps);
	}
}
