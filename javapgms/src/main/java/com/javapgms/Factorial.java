package com.javapgms;

public class Factorial {

	public static void main(String[] args) {

		int num = 5;

		System.out.println("Printing with While Loop " + factorialWhile(num));
		System.out.println("Printing with for Loop " + factorialfor(num));
	}

	public static int factorialWhile(int num) {
		int fact = 1;
		while (num >= 1) {

			fact = fact * (num);

			num--;

		}

		return fact;
	}

	public static int factorialfor(int num) {
		int fact = 1;
		for (int i = 1; i <= 5; i++) {
			fact = fact * (i);

		}

		return fact;
	}

}
