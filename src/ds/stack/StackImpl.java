package ds.stack;

import java.util.Random;
import java.util.Stack;

public class StackImpl {

	static int top = -1;
	static int[] stack = new int[5];

	public static void main(String a[]) {

		Random rand = new Random();
		int upperbound = 25;

		Stack st = new  Stack();
		

		for (int i = 0; i < 9; i++) {
			int int_random = rand.nextInt(upperbound);
			push(int_random);
		}

		for (int i = 0; i < 9; i++) {
			pop();
		}


		for (int i = 0; i < top; i++) {
			System.out.println(stack[i]);
		}
	}

	private static void push(int value) {
		if (top == stack.length - 1) {
			System.out.println("Stack is full!!!");
			return;
		}

		top = top + 1;
		stack[top] = value;
		System.out.println("Pushed value:" + value + " and top:" + top);
	}

	private static int pop() {
		if (top == -1) {
			System.out.println("Stack is empty !!!");
			return -1;
		}

		int value = stack[top];
		top = top - 1;
		System.out.println("Popped value:" + value + " and top:" + top);
		return value;

	}

}
