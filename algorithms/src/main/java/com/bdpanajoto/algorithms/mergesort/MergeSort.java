package com.bdpanajoto.algorithms.mergesort;

import java.util.Arrays;
import java.util.Objects;

/**
 * This is an implementation of Merge Sort algorithm.
 * 
 * The complexity is O(nlogn).
 * 
 * @author bdpanajoto
 *
 */
public class MergeSort {
	/**
	 * First try in implementing Merge Sort.
	 * 
	 * @param array
	 *            sequence of unsorted integers.
	 * @return new instance of an array object.
	 */
	public static final int[] sort(int[] array) {
		Objects.requireNonNull(array);

		if (array.length == 1)
			return array;
		if (array.length > 1) {
			array = merge(sort(Arrays.copyOfRange(array, 0, Math.floorDiv(array.length, 2))),
					sort(Arrays.copyOfRange(array, Math.floorDiv(array.length, 2), array.length)));
		}
		return array;
	}

	private static int[] merge(int[] a, int[] b) {
		int[] merged = new int[a.length + b.length];

		int index = 0;
		int indexa = 0;
		int indexb = 0;

		while (true) {
			if (indexa < a.length && indexb < b.length && a[indexa] < b[indexb]) {
				merged[index] = a[indexa];
				index++;
				indexa++;
			} else if (indexa < a.length && indexb < b.length && a[indexa] >= b[indexb]) {
				merged[index] = b[indexb];
				index++;
				indexb++;
			} else if (indexa < a.length && indexb >= b.length) {
				merged[index] = a[indexa];
				index++;
				indexa++;
			} else if (indexa >= a.length && indexb < b.length) {
				merged[index] = b[indexb];
				index++;
				indexb++;
			} else {
				break;
			}
		}

		return merged;
	}
}
