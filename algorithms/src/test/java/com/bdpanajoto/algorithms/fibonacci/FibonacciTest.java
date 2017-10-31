package com.bdpanajoto.algorithms.fibonacci;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FibonacciTest {

	@DataProvider(name = "FibonacciForTest")
	public static Object[][] getAllSortingAlgorithms() {
		return new Object[][] { { new FibonacciNaive() }, { new FibonacciWithDictionary() },
				{ new FibonacciWithLast2Saved() } };
	}

	@Test(dataProvider = "FibonacciForTest")
	public void testFibonacci(Fibonacci fibo) {
		Assert.assertEquals(fibo.generate(0), 0);
		Assert.assertEquals(fibo.generate(1), 1);
		Assert.assertEquals(fibo.generate(2), 1);
		Assert.assertEquals(fibo.generate(3), 2);
		Assert.assertEquals(fibo.generate(4), 3);
		Assert.assertEquals(fibo.generate(5), 5);
		Assert.assertEquals(fibo.generate(6), 8);
		Assert.assertEquals(fibo.generate(30), 832040L);
		Assert.assertEquals(fibo.generate(50), 12586269025L);
		if (!(fibo instanceof FibonacciNaive)) {
			Assert.assertEquals(fibo.generate(100), 3736710778780434371L);
		}
	}
}
