package algo.sort;
/*
 * 
 */
public class BubbleSort {
	public static void main(String[] args) {
		long oldTime=System.nanoTime();
		
		int[] unsortedArr = { 21, 5, 62, 9, 2 };
		int arrLengthForOuterLoop = unsortedArr.length;
		int arrLengthForInnerLoop = unsortedArr.length;
		int count=1;

		for (int i = 0; i < arrLengthForOuterLoop - 1; i++) {
			for (int j = 0; j < arrLengthForInnerLoop - 1; j++) {
				if (unsortedArr[j] > unsortedArr[j + 1]) {
					int tempValue = unsortedArr[j + 1];
					unsortedArr[j + 1] = unsortedArr[j];
					unsortedArr[j] = tempValue;
				}
			}
			/*for (int k = 0; k < unsortedArr.length; k++) {
				System.out.print(" " + unsortedArr[k]);
			}
			System.out.println();*/
			//arrLengthForInnerLoop--;
		}
		
		System.out.println(System.nanoTime()-oldTime);

	}

}
