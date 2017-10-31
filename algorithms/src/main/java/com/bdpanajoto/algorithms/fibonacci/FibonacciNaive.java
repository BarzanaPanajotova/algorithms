package com.bdpanajoto.algorithms.fibonacci;

/**
 * Time complexity O(2^n).
 * 
 * @author bdpanajoto
 *
 */
public class FibonacciNaive implements Fibonacci {

	public long generate(int n) {
		if (n == 0)
			return 0;
		else if (n == 1 || n == 2)
			return 1;
		else
			return generate(n - 1) + generate(n - 2);
	}
}
