package com.bdpanajoto.algorithms.numbersontape;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NumbersOnTapeTest {

	private static final int[] LARGE_NUMBERS_CORNER_CASE = new int[] { 1000, 1000 };
	private static final int[] SMALL_LARGE_NUMBERS_CORNER_CASE = new int[] { -1000, 1000 };
	private static final int[] SMALL_NUMBERS_CORNER_CASE = new int[] { 5, -1 };
	private static final int[] EXAMPLE_TAPE = new int[] { 3, 1, 2, 4, 3 };
	private static final int[] RANDOM_TAPE = new int[] { 671, -166, -999, 475, 65, 318, 612, 964, -652, -84, 194, -369,
			393, 900, 987, 303, -910, 318, -121, 631 };

	@DataProvider(name = "TapesForTest")
	public static Object[][] getAllTapes() {
		return new Object[][] { { EXAMPLE_TAPE, 1 }, { SMALL_NUMBERS_CORNER_CASE, 6 }, { LARGE_NUMBERS_CORNER_CASE, 0 },
				{ SMALL_LARGE_NUMBERS_CORNER_CASE, 2000 }, { RANDOM_TAPE, 350 } };
	}

	@Test(dataProvider = "TapesForTest")
	public void testNumbersOnTape(int[] tape, int result) {
		Assert.assertEquals(NumbersOnTape.getSmallestDiff(tape), result);
	}
}
