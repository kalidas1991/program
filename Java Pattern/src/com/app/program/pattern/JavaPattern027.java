package com.app.program.pattern;

/**
 * Java Pattern
 * 
 * @author Kalidas A Daundkar
 *
 */
public class JavaPattern027 {
	public static void main(String[] args) {
		char number = 'E';
		for (char i = 'A'; i <= 'E'; i++) {
			for (char j = (char) (number - 1); j >= i; j--) {
				System.out.print(" ");
			}
			for (char k = 'A'; k <= i; k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}
}
