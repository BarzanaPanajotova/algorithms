package com.bdpanajoto.algorithms.frogcrossriver;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FrogCrossRiverTest {
	@Test
	public void testFrogCrossRiverExample() {
		Assert.assertEquals(new FrogCrossRiver().solution(5, new int[] { 1, 3, 1, 4, 2, 3, 5, 4 }, 8), 6);
	}

}
