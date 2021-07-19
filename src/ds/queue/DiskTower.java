package ds.queue;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DiskTower {

	private static int top = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int[] disks = new int[len];
		int[] sortedDisk = new int[len];
		top = len - 1;

		Set<Integer> ds = new HashSet<Integer>();

		for (int i = 0; i < len; i++) {
			disks[i] = sc.nextInt();
			sortedDisk[i] = disks[i];
		}

		Arrays.parallelSort(sortedDisk);

		for (int i = 0; i < len; i++) {

			if (disks[i] != getTop(sortedDisk)) {
				System.out.println();
				ds.add(disks[i]);
				continue;
			}

			checkAndPrint(sortedDisk, ds);
		}

	}

	private static void checkAndPrint(int[] sortedDisk, Set<Integer> ds) {
		System.out.print(pop(sortedDisk));

		while (top!=-1 && ds.contains(sortedDisk[top])) {
			System.out.print(" "+pop(sortedDisk));
		}
		System.out.println();
	}

	private static int pop(int[] sortedDisk) {
		if (top == -1) {
			System.out.println("sortedDisk is empty !!!");
			return -1;
		}

		int value = sortedDisk[top];
		top = top - 1;
		return value;

	}

	public static int getTop(int[] sortedDisk) {
		return sortedDisk[top];
	}

}
