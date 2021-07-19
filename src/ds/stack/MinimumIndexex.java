package ds.stack;

import java.util.Scanner;

public class MinimumIndexex {

	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);

		int l = sc.nextInt();
		int q = sc.nextInt();
		int[] arr = new int[l];

		for (int i = 0; i < l; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < q; i++) {
			int result = -1;
			int ind = sc.nextInt();

			for (int j = ind; j < l; j++) {
				if (arr[ind - 1] < arr[j] && digitSum(arr[ind - 1], arr[j])) {
					result = j + 1;
					break;
				}
			}

			System.out.println(result);
		}
	}

	private static boolean digitSum(int v1, int v2) {
		return sum(v1) > sum(v2);
	}

	private static int sum(int m) {
		int n, sum = 0;
		while (m > 0) {
			n = m % 10;
			sum = sum + n;
			m = m / 10;
		}
		return sum;
	}

}
