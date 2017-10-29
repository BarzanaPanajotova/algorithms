package com.bdpanajoto.algorithms.searching;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.bdpanajoto.algorithms.searching.binarysearch.BinarySearch;

public class SearchingAlgorithmsTest {
	private static final int[] EMPTY_ARRAY = new int[] {};
	private static final int[] ONE_ELEMENT_ARRAY = new int[] { 1 };
	private static final int[] SORTED_ARRAY = new int[] { 29, 34, 43, 46, 57, 63, 69, 79, 96, 96, 103, 110, 147, 153,
			164, 174, 183, 188, 203, 216, 236, 251, 252, 255, 255, 258, 261, 264, 268, 272, 282, 282, 283, 284, 290,
			296, 308, 311, 330, 337, 341, 345, 347, 357, 366, 371, 421, 436, 437, 441, 452, 455, 459, 476, 476, 496,
			510, 515, 542, 554, 559, 560, 576, 582, 595, 598, 605, 632, 635, 681, 689, 707, 719, 729, 730, 747, 759,
			788, 788, 793, 798, 813, 822, 840, 841, 842, 902, 910, 915, 915, 923, 929, 932, 933, 937, 939, 942, 962,
			969, 995 };

	@DataProvider(name = "SearchingAlgorithmsForTest")
	public static Object[][] getAllSortingAlgorithms() {
		return new Object[][] { { new BinarySearch() } };
	}

	@Test(expectedExceptions = NullPointerException.class, dataProvider = "SearchingAlgorithmsForTest")
	public void testSearchingNULL(SearchingAlgorithm searchingAlgorithm) {
		searchingAlgorithm.indexOf(null, 0);
	}

	@Test(dataProvider = "SearchingAlgorithmsForTest")
	public void testSearchingEmpty(SearchingAlgorithm searchingAlgorithm) {
		int test = searchingAlgorithm.indexOf(EMPTY_ARRAY.clone(), 0);
		Assert.assertEquals(test, -1);
	}
	
	@Test(dataProvider = "SearchingAlgorithmsForTest")
	public void testSearchingOneElement(SearchingAlgorithm searchingAlgorithm) {
		int test = searchingAlgorithm.indexOf(ONE_ELEMENT_ARRAY.clone(), 1);
		Assert.assertEquals(test, 0);
	}
	
	@Test(dataProvider = "SearchingAlgorithmsForTest")
	public void testSearching(SearchingAlgorithm searchingAlgorithm) {
		long startTime = System.nanoTime();
		int test = searchingAlgorithm.indexOf(SORTED_ARRAY.clone(),632);
		long endTime = System.nanoTime();
		Assert.assertEquals(test, Arrays.binarySearch(SORTED_ARRAY, 632));		
		System.out
				.println("testSortingBestCase:" + searchingAlgorithm.getClass().getName() + ":" + (endTime - startTime));
	}
}
