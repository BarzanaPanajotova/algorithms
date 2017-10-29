package com.bdpanajoto.algorithms.sorting.insertionsort;

import com.bdpanajoto.algorithms.sorting.SortingAlgorithm;

/**
 * In this second attempt at insertion sort I aim to take every element from the
 * array and insert it at it's right place in the array places before it. I pass
 * the index of the already sorted array to the insert method.
 * 
 * The complexity of this algorithm is not improved but the readability and
 * maintainability is certainly better.
 * 
 * @author bdpanajoto
 *
 */
public class SecondAttemptAtInsertionSort implements SortingAlgorithm {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int[] sort(int[] array) {
		for (int index = 1; index < array.length; index++) {
			insertAtRightPlace(array[index], array, index - 1);
		}
		return array;
	}

	private void insertAtRightPlace(int number, int[] array, int sortedIndex) {
		while (sortedIndex >= 0 && number < array[sortedIndex]) {
			array[sortedIndex + 1] = array[sortedIndex];
			sortedIndex--;
		}
		array[sortedIndex + 1] = number;
	}
}
