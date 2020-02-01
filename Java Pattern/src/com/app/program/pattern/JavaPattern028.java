package com.app.program.pattern;

/**
 * Java Pattern
 * 
 * @author Kalidas A Daundkar
 *
 */
public class JavaPattern028 {
	public static void main(String[] args) {
		char character = 'E';
		for (char i = 'A'; i <= 'E'; i++) {
			for (char j = (char) (character - 1); j >= i; j--) {
				System.out.print(" ");
			}
			for (char k = 'A'; k <= i; k++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
