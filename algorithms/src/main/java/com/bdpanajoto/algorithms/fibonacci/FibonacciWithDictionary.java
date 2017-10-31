package com.bdpanajoto.algorithms.fibonacci;

/**
 * Time complexity O(n). Space O(n).
 * 
 * @author bdpanajoto
 *
 */
public class FibonacciWithDictionary implements Fibonacci {

	public long generate(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		long[] dictionary = new long[n + 1];
		dictionary[0] = 0;
		dictionary[1] = 1;
		for (int i = 2; i <= n; i++) {
			dictionary[i] = dictionary[i - 1] + dictionary[i - 2];
		}

		return dictionary[n];
	}
}
