package algo.search;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int valueToBeSearched = 5;

		int index = binarySearch(arr, valueToBeSearched, 0, arr.length - 1);
		System.out.println(index);
	}

	private static int binarySearch(int[] arr, int valueToBeSearched,
			int lowerBound, int upperBound) {

		int mid = (lowerBound+upperBound) / 2;
		int index = 0;
		
		if(lowerBound>upperBound){
			return -1;
		}

		if (valueToBeSearched == arr[mid]) {
			return mid;
		}else if (valueToBeSearched < arr[mid]) {
			index = binarySearch(arr, valueToBeSearched, lowerBound, mid - 1);
		}else{
			index = binarySearch(arr, valueToBeSearched, mid + 1, upperBound);
		}

		return index;

	}

}
