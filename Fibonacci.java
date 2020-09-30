/*
 * Fibonacci.java
 * By: Jameson Squyres
 * 
 * This program will list out the terms of the Fibonacci sequence up to
 * MAX_TERM_VALUE.
 */

import acm.program.*;

public class Fibonacci extends ConsoleProgram {
	// Sets the max value to run to
	private static final int MAX_TERM_VALUE = 10000;
	
	public void run() {
		println("This program lists the Fibonacci sequence.");
		int term1 = 0;
		int term2 = 1;
		int term3 = 1;
		while(term1 <= MAX_TERM_VALUE) {
			println(term1);
			term1 = term2;
			term2 = term3;
			term3 = term1 + term2;
		}
	}
}