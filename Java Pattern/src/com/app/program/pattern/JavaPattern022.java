package com.app.program.pattern;

/**
 * Java Pattern
 * 
 * @author Kalidas A Daundkar
 *
 */
public class JavaPattern022 {
	public static void main(String[] args) {
		for (char i = 'E'; i >= 'A'; i--) {
			for (char j = 'A'; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
