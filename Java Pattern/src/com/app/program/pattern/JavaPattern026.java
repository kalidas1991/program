package com.app.program.pattern;

/**
 * Java Pattern
 * 
 * @author Kalidas A Daundkar
 *
 */
public class JavaPattern026 {
	public static void main(String[] args) {

		int number = 5;
		for (int i = 1; i <= 5; i++) {
			for (int j = number - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}

}
