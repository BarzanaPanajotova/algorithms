package com.bdpanajoto.algorithms.insertionsort;

import java.util.Objects;

/**
 * This is an implementation of Insertion Sort in Java. The basic algorithm
 * definition is to sort the elements of the given array by going through every
 * single value of the array and inserting it at the right place in the
 * preceding part of the array.
 * 
 * The invariant of the algorithm is that the first part of the array that
 * consists of elements before the element we are currently looking at is always
 * sorted.
 * 
 * The complexity of the algorithm is O(n^2).
 * 
 * @author bdpanajoto
 *
 */
public final class InsertionSort {
	/**
	 * First try in implementing Insertion Sort.
	 * 
	 * @param array
	 *            sequence of unsorted integers.
	 * @return the same array instance but sorted.
	 */
	public static final int[] sort(int[] array) {
		Objects.requireNonNull(array);
		for (int i = 1; i < array.length; i++) {
			int j = i;
			while (j > 0) {
				if (array[j] < array[j - 1]) {
					int temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
				j--;
			}
		}

		return array;
	}
}
