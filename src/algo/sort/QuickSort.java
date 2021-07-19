package algo.sort;

public class QuickSort {

	public static void main(String[] args) {

		int[] unsorteArray = { 1, 12, 5, 26, 7, 14, 3, 7, 2 };

		quickSort(unsorteArray, 0, unsorteArray.length - 1);

		for (int i = 0; i < unsorteArray.length; i++) {
			System.out.print("  " + unsorteArray[i]);
		}
	}

	public static void quickSort(int[] arr, int leftBound, int rightBound) {

		int index = partition(arr, leftBound, rightBound);

		if (leftBound < index - 1)
			quickSort(arr, leftBound, index - 1);
		if (index < rightBound)
			quickSort(arr, index, rightBound);

	}

	private static int partition(int[] arr, int leftBound, int rightBound) {
		int pivot = (leftBound + rightBound) / 2;

		while (leftBound <= rightBound) {

			while (arr[leftBound] < arr[pivot]) {
				leftBound++;
			}

			while (arr[rightBound] > arr[pivot]) {
				rightBound--;
			}

			if (leftBound <= rightBound) {
				int temp = arr[leftBound];
				arr[leftBound] = arr[rightBound];
				arr[rightBound] = temp;
				leftBound++;
				rightBound--;
			}

		}

		return leftBound;
	}

}
