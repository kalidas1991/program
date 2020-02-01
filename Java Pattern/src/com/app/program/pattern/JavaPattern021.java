package com.app.program.pattern;

/**
 * Java Pattern
 * 
 * @author Kalidas A Daundkar
 *
 */
public class JavaPattern021 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
