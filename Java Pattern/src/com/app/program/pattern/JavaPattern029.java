package com.app.program.pattern;

public class JavaPattern029 {
	public static void main(String[] args) {
		int number = 5;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k <= number; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
