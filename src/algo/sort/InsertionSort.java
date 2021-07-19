package algo.sort;

public class InsertionSort {
	public static void main(String[] args) {
		
		long oldTime=System.nanoTime();

		int[] unsortedArr = { 21, 5, 62, 9, 2 };
		int arrLengthForOuterLoop = unsortedArr.length;
		int arrLengthForInnerLoop = unsortedArr.length;

		for (int i = 0; i < arrLengthForOuterLoop; i++) {
			for (int j = i; j < arrLengthForInnerLoop; j++) {
				if (unsortedArr[i] > unsortedArr[j]) {
					int tempValue = unsortedArr[i];
					unsortedArr[i] = unsortedArr[j];
					unsortedArr[j] = tempValue;
				}
			}

			/*for (int j = 0; j < unsortedArr.length; j++) {
				System.out.print("  " + unsortedArr[j]);
			}
			System.out.println("");*/
		}
		
		System.out.println(System.nanoTime()-oldTime);
	}
}
