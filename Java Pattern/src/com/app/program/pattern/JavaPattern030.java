package com.app.program.pattern;

public class JavaPattern030 {
	public static void main(String[] args) {
		int number = 1;
		for (int i = 5; i <= 5; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = number; k <= i; k++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
