package dsa.sorting;

public class InsertionSort {
	void insertionSort(int[] arr) {
		int lengthOfArray = arr.length;
		for (int i = 1; i < lengthOfArray; i++) {
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && temp < arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;

		}
	}
}
