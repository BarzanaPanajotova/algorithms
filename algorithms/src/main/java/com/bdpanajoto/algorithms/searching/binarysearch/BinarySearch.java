package com.bdpanajoto.algorithms.searching.binarysearch;

import com.bdpanajoto.algorithms.searching.SearchingAlgorithm;

/**
 * 
 * Complexity O(logn).
 * 
 * @author bdpanajoto
 *
 */
public class BinarySearch implements SearchingAlgorithm {
	/**
	 * {@inheritDoc}
	 */
	public int indexOf(int[] array, int value) {
		if (array.length == 0)
			return -1;
		if (array.length == 1)
			return 0;
		return find(array, value, 0, array.length - 1);
	}

	private int find(int[] array, int value, int startIndex, int endIndex) {
		if (endIndex < startIndex)
			return -1;
		int halfway = startIndex + Math.floorDiv(endIndex - startIndex, 2);

		if (array[halfway] == value) {
			return halfway;
		} else if (array[halfway] > value) {
			return find(array, value, startIndex, halfway - 1);
		} else {
			return find(array, value, halfway + 1, endIndex);
		}
	}
}
