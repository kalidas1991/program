package com.app.program.pattern;

/**
 * Java Pattern
 * 
 * @author Kalidas A Daundkar
 *
 */
public class JavaPattern024 {
	public static void main(String[] args) {

		int number = 5;
		for (int i = 1; i <= number; i++) {
			for (int j = number - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
