package com.bdpanajoto.algorithms.insertionsort;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InsertionSortTest {
	private static final int[] UNSORTED_ARRAY = new int[] { 4, 8, 2, 5, 1, 9, 14, 7 };
	private static final int[] SORTED_ARRAY = new int[] { 1, 2, 4, 5, 7, 8, 9, 14 };
	private static final int[] UNSORTED_ARRAY_WORST_CASE = new int[] { 14, 9, 8, 7, 5, 4, 2, 1 };

	@Test(expectedExceptions = NullPointerException.class)
	public void testSortingNULL() {
		InsertionSort.sort(null);
	}

	@Test
	public void testSortingEmpty() {
		int[] testArray = InsertionSort.sort(new int[] {});
		Assert.assertEquals(testArray, new int[] {});
	}

	@Test
	public void testSortingOneElement() {
		int[] testArray = InsertionSort.sort(new int[] { 1 });
		Assert.assertEquals(testArray, new int[] { 1 });
	}

	@Test
	public void testSorting() {
		int[] testArray = InsertionSort.sort(UNSORTED_ARRAY);
		Assert.assertEquals(testArray, SORTED_ARRAY);
	}

	@Test
	public void testSortingBestCase() {
		int[] testArray = InsertionSort.sort(SORTED_ARRAY);
		Assert.assertEquals(testArray, SORTED_ARRAY);
	}

	@Test
	public void testSortingWorstCase() {
		int[] testArray = InsertionSort.sort(UNSORTED_ARRAY_WORST_CASE);
		Assert.assertEquals(testArray, SORTED_ARRAY);
	}
}
