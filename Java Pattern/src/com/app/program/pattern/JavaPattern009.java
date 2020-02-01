/**
 * 
 */
package com.app.program.pattern;

/**
 * Java Pattern
 * 
 * @author Kalidas A Daundkar
 *
 */
public class JavaPattern009 {
	public static void main(String[] args) {
		for (char i = 'A'; i <= 'E'; i++) {
			for (char j = 'E'; j >= 'A'; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
