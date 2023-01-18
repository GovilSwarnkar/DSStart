package com.ds.array;

public class ArrayOperations {

	private int size = 100;
	private int length;
	private int[] a;

	public int getLength() {
		return this.length;
	}
	public void display() {
		if (length > 0) {
			for (int i = 0; i < length; i++) {
				System.out.print(a[i] + " ");
			}
		} else {
			System.out.println("Empty Array");
		}
	}

	public void add(int item) {
		if (length < size) {
			a[length++] = item;
		}
	}

	public void insert(int index, int item) {
		if (index >= 0 && index < length) {
			int i = length;
			while (i > index) {
				a[i] = a[i - 1];
				i--;
			}
			a[i] = item;
			length++;
		} else {
			System.out.println("Please enter index less than length of array");
		}
	}

	public int delete(int index) {
		if (index <= 0 || index > length) {
			System.out.println("Please enter index less than length of array and starting from 0");
			return -1;
		}
		int deleted = a[index];
		for (int i = index; i < length; i++) {
			a[i] = a[i + 1];
		}
		return deleted;
	}

	public int linearSearch(int key) {
		for (int i = 0; i < length; i++) {
			if (a[i] == key) {
				return i;
			}
		}
		return -1;
	}

	private void swap(int i, int j) {
		int c = a[i];
		a[i] = a[j];
		a[j] = c;
	}

	public int linearSearchTranspotion(int key) {
		for (int i = 0; i < length; i++) {
			if (a[i] == key) {
				swap(i, i - 1);
				return i;
			}
		}
		return -1;
	}

	public int get(int index) {
		if (index >= 0 && index < length) {
			return a[index];
		}
		return -1;
	}

	public void set(int index, int x) {
		if (index >= 0 && index < a.length) {
			a[index] = x;
		}
	}

	public int max() {
		int max = a[0];
		for (int i = 1; i < length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	public int min() {
		int min = a[0];
		for (int i = 1; i < length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}

	public int sum() {
		int sum = 0;
		for (int i = 0; i < length; i++) {
			sum += a[i];
		}
		return sum;
	}

	private int recSum(int n) {
		if (n == 0) {
			return a[0];
		}
		return a[n] + recSum(n - 1);
	}

	public int sumR() {
		return recSum(length - 1);
	}
	
	public float avg() {
		return sum() / length;
	}

	public void reverse() {
		int i = 0, j = length - 1;
		while(i < j) {
			swap(i++, j--);
		}
	}

	public void leftRotate() {
		int t = a[0], i = 0;
		while(i < length - 1) {
			a[i] = a[i + 1];
			i++;
		}
		a[i] = t;
	}

	public static void main(String[] args) {
		ArrayOperations ao = new ArrayOperations();
		ao.a = new int[ao.size];
		ao.add(2);
		ao.add(5);
		ao.add(8);
		ao.add(3);
		ao.add(1);
		ao.add(6);
		ao.display();
		System.out.println();
		/*
		 * System.out.println(); ao.insert(3, 17); ao.display(); System.out.println();
		 * ao.insert(7, 18); ao.display();
		 */

		/*
		 * System.out.println(); // int deleted = ao.delete(2); int deleted =
		 * ao.delete(10); if (deleted != -1) { System.out.println("\ndeleted: " +
		 * deleted); }
		 */
		/*
		 * System.out.println(); int indexAt = ao.linearSearch(6); if (indexAt != -1) {
		 * System.out.println(indexAt); } else { System.out.println("Key not found"); }
		 */

		/*
		 * System.out.println(); int indexAt = ao.linearSearchTranspotion(6); if
		 * (indexAt != -1) { System.out.println(indexAt); } else {
		 * System.out.println("Key not found"); }
		 * 
		 * ao.display(); int indexAt1 = ao.linearSearchTranspotion(6);
		 * System.out.println(); System.out.println("After swapping : " + indexAt1);
		 */

		// System.out.println("\n" + ao.get(5));

		/*
		 * ao.set(5, 10); System.out.println(); ao.display();
		 */

		// System.out.println("Max : " + ao.max());

		// System.out.println("Min : " + ao.min());

		//System.out.println("Sum : " + ao.sum());
		
		//System.out.println("Sum : " + ao.sumR());
		
		//System.out.println("Avg : " + ao.avg());
		
		/*
		 * System.out.println("Reverse : "); ao.reverse(); ao.display();
		 */
		
		System.out.println("left rotate : ");
		ao.leftRotate();
		ao.display();
	}
}
