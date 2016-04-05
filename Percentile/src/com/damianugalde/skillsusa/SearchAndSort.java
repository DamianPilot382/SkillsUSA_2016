package com.damianugalde.skillsusa;

/**
 * 
 * Searching and sorting utliities.
 * 
 * @author Damian Ugalde
 * @date 2016-04-02
 *
 */
public class SearchAndSort {
	
	/**
	 * Overloaded quickSort method, for easier execution, with default values to range the whole array.
	 * 
	 * @param arr The array to be sorted.
	 */
	public static void quickSort(int[] arr) {
		quickSort(arr, 0, arr.length - 1);
	}
	
	/**
	 *  Full method for sorting an array recursively with quickSort. Runtime of O(n log(n))
	 * @param arr The array to be sorted.
	 * @param low Initial low value.
	 * @param high Initial high value.
	 */
	private static void quickSort(int[] arr, int low, int high) {
		int i = low, j = high;
		int pivot = arr[low + (high - low) / 2];

		while (i <= j) {
			while (arr[i] < pivot)
				i++;
			while (arr[j] > pivot)
				j--;
			if (i <= j) {
				swap(arr, i, j);
				i++;
				j--;
			}
		}

		if (low < j)
			quickSort(arr, low, j);
		if (i < high)
			quickSort(arr, i, high);
	}
	
	/**
	 * Changes the position of two elements oif an array.
	 * @param arr The aray to be modified.
	 * @param first Index of the first element.
	 * @param second Index of the second element.
	 */
	public static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

	/**
	 * Overloaded method for the binarySearch, that will cover the full range of the array.
	 * @param arr The array that will be searched.
	 * @param value number that needs to be found.
	 * @return The index of the {@code value} inside of {@code arr}
	 */
	public static int binarySearch(int[] arr, int value) {
		return binarySearch(arr, 0, arr.length - 1, value);
	}
	
	/**
	 * Full implementation of a binary Search, to recursively find a value inside of an array, using the divide and conquer method,
	 * with runtime of O(log(n))
	 * @param a array to be searched.
	 * @param low Initial lower value
	 * @param high Initial higher value
	 * @param value Number that needs to be found.
	 * @return The index of the {@code value} inside of {@code arr}
	 */
	public static int binarySearch(int[] a, int low, int high, int value) {
		if (low <= high) {
			int mid = (low + high) / 2;

			if (a[mid] == value) {
				return mid;
			} else if (a[mid] < value) {
				return binarySearch(a, mid + 1, high, value);
			} else {
				return binarySearch(a, low, mid - 1, value);
			}
		} else {
			return -low;
		}
	}
}
