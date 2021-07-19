package ds.stack;

//read longputs
//pop until k-1 and keep max with you
//push max
//if empty then push and pop max

import java.util.Scanner;

public class FindTopMax {

	private static int top = -1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int k = sc.nextInt();

		long[] stack = new long[l];
		long max = -1;
		top = l - 1;

		for (int i = l - 1; i >= 0; i--) {
			stack[i] = sc.nextLong();
		}

		for (int i = 0; i < k; i++) {
			long value = pop(stack);
			max = value > max ? value : max;
		}

		push(stack, max);
		System.out.println(max);
	}

	private static void push(long[] stack, long value) {
		if (top == stack.length - 1) {
			return;
		}

		top = top + 1;
		stack[top] = value;
	}

	private static long pop(long[] stack) {
		if (top == -1) {
			return -1;
		}

		long value = stack[top];
		top = top - 1;
		return value;

	}

}
