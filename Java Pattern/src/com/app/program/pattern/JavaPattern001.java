package com.app.program.pattern;

/**
 * Java Pattern
 * 
 * @author Kalidas A Daundkar
 *
 */
public class JavaPattern001 {
	public static void main(String[] args) {
		pattern1();
	}

	public static void pattern1() {

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
