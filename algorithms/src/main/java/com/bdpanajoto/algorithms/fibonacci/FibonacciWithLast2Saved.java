package com.bdpanajoto.algorithms.fibonacci;

/**
 * Time complexity O(n). Space O(1).
 * 
 * @author bdpanajoto
 *
 */
public class FibonacciWithLast2Saved implements Fibonacci {

	public long generate(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;

		long first = 0;
		long second = 1;
		long result = 0;
		for (int i = 2; i <= n; i++) {
			result = first + second;
			first = second;
			second = result;
		}

		return result;
	}
}
