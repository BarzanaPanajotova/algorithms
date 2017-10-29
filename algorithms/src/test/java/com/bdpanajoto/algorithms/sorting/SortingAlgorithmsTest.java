package com.bdpanajoto.algorithms.sorting;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.bdpanajoto.algorithms.sorting.insertionsort.InsertionSort;
import com.bdpanajoto.algorithms.sorting.insertionsort.SecondAttemptAtInsertionSort;
import com.bdpanajoto.algorithms.sorting.mergesort.MergeSort;

public class SortingAlgorithmsTest {
	private static final int[] ONE_ELEMENT_ARRAY = new int[] { 1 };
	private static final int[] EMPTY_ARRAY = new int[] {};
	private static final int[] UNSORTED_ARRAY = new int[] { 282, 719, 939, 788, 252, 436, 813, 793, 216, 96, 437, 366,
			203, 272, 357, 730, 455, 29, 261, 341, 174, 255, 689, 933, 452, 147, 841, 43, 46, 284, 788, 34, 164, 707,
			308, 560, 57, 559, 311, 96, 915, 902, 515, 681, 496, 576, 598, 910, 268, 347, 840, 476, 282, 822, 729, 595,
			183, 188, 632, 258, 554, 937, 747, 510, 942, 476, 236, 798, 69, 153, 459, 923, 421, 635, 330, 345, 290, 103,
			63, 605, 110, 932, 251, 283, 264, 296, 915, 759, 969, 962, 441, 371, 929, 337, 995, 255, 842, 582, 79,
			542 };
	private static final int[] SORTED_ARRAY = new int[] { 29, 34, 43, 46, 57, 63, 69, 79, 96, 96, 103, 110, 147, 153,
			164, 174, 183, 188, 203, 216, 236, 251, 252, 255, 255, 258, 261, 264, 268, 272, 282, 282, 283, 284, 290,
			296, 308, 311, 330, 337, 341, 345, 347, 357, 366, 371, 421, 436, 437, 441, 452, 455, 459, 476, 476, 496,
			510, 515, 542, 554, 559, 560, 576, 582, 595, 598, 605, 632, 635, 681, 689, 707, 719, 729, 730, 747, 759,
			788, 788, 793, 798, 813, 822, 840, 841, 842, 902, 910, 915, 915, 923, 929, 932, 933, 937, 939, 942, 962,
			969, 995 };
	private static final int[] UNSORTED_ARRAY_WORST_CASE = new int[] { 995, 969, 962, 942, 939, 937, 933, 932, 929, 923,
			915, 915, 910, 902, 842, 841, 840, 822, 813, 798, 793, 788, 788, 759, 747, 730, 729, 719, 707, 689, 681,
			635, 632, 605, 598, 595, 582, 576, 560, 559, 554, 542, 515, 510, 496, 476, 476, 459, 455, 452, 441, 437,
			436, 421, 371, 366, 357, 347, 345, 341, 337, 330, 311, 308, 296, 290, 284, 283, 282, 282, 272, 268, 264,
			261, 258, 255, 255, 252, 251, 236, 216, 203, 188, 183, 174, 164, 153, 147, 110, 103, 96, 96, 79, 69, 63, 57,
			46, 43, 34, 29 };

	@DataProvider(name = "SortingAlgorithmsForTest")
	public static Object[][] getAllSortingAlgorithms() {
		return new Object[][] { { new InsertionSort() }, { new MergeSort() }, { new SecondAttemptAtInsertionSort() } };
	}

	@Test(expectedExceptions = NullPointerException.class, dataProvider = "SortingAlgorithmsForTest")
	public void testSortingNULL(SortingAlgorithm sortingAlgorithm) {
		sortingAlgorithm.sort(null);
	}

	@Test(dataProvider = "SortingAlgorithmsForTest")
	public void testSortingEmpty(SortingAlgorithm sortingAlgorithm) {
		int[] testArray = sortingAlgorithm.sort(EMPTY_ARRAY.clone());
		Assert.assertEquals(testArray, EMPTY_ARRAY);
	}

	@Test(dataProvider = "SortingAlgorithmsForTest")
	public void testSortingOneElement(SortingAlgorithm sortingAlgorithm) {
		int[] testArray = sortingAlgorithm.sort(ONE_ELEMENT_ARRAY.clone());
		Assert.assertEquals(testArray, ONE_ELEMENT_ARRAY);
	}

	@Test(dataProvider = "SortingAlgorithmsForTest")
	public void testSorting(SortingAlgorithm sortingAlgorithm) {
		long startTime = System.nanoTime();
		int[] testArray = sortingAlgorithm.sort(UNSORTED_ARRAY.clone());
		Assert.assertEquals(testArray, SORTED_ARRAY);
		long endTime = System.nanoTime();
		System.out.println("testSorting:" + sortingAlgorithm.getClass().getName() + ":" + (endTime - startTime));
	}

	@Test(dataProvider = "SortingAlgorithmsForTest")
	public void testSortingBestCase(SortingAlgorithm sortingAlgorithm) {
		long startTime = System.nanoTime();
		int[] testArray = sortingAlgorithm.sort(SORTED_ARRAY.clone());
		Assert.assertEquals(testArray, SORTED_ARRAY);
		long endTime = System.nanoTime();
		System.out
				.println("testSortingBestCase:" + sortingAlgorithm.getClass().getName() + ":" + (endTime - startTime));
	}

	@Test(dataProvider = "SortingAlgorithmsForTest")
	public void testSortingWorstCase(SortingAlgorithm sortingAlgorithm) {
		long startTime = System.nanoTime();
		int[] testArray = sortingAlgorithm.sort(UNSORTED_ARRAY_WORST_CASE.clone());
		Assert.assertEquals(testArray, SORTED_ARRAY);
		long endTime = System.nanoTime();
		System.out.println(
				"testSortingWorstCase: " + sortingAlgorithm.getClass().getName() + ":" + (endTime - startTime));
	}
}
