package com.bdpanajoto.algorithms.frogjumps;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FrogJumpsTest {

	private static final int[] THIRD_CORNER_CASE = new int[] { 1, 1000000000, 1 };
	private static final int[] SECOND_CORNER_CASE = new int[] { 1, 1, 10 };
	private static final int[] FIRST_CORNER_CASE = new int[] { 1000000000, 1000000000, 10 };
	private static final int[] EXAMPLE = new int[] { 10, 85, 30 };

	@DataProvider(name = "ValuesForTest")
	public static Object[][] getAllTests() {
		return new Object[][] { { EXAMPLE, 3 }, { FIRST_CORNER_CASE, 0 },
				{ SECOND_CORNER_CASE, 0 }, { THIRD_CORNER_CASE, 999999999 } };
	}

	@Test(dataProvider = "ValuesForTest")
	public void testFrogJumps(int[] testcase, int result) {
		Assert.assertEquals(new FrogJumps().solution(testcase[0], testcase[1], testcase[2]), result);
	}

}
