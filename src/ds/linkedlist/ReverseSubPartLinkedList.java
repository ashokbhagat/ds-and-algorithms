package ds.linkedlist;

import java.util.Scanner;
import java.util.Stack;

public class ReverseSubPartLinkedList {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();

		LinkedListImpl2 linkedList = new LinkedListImpl2();
		for (int i = 0; i < len; i++) {
			linkedList.insert(new MyNode(sc.nextInt()));
		}

		// linkedList.display();
		linkedList.reverseSubPart();
		linkedList.display();

	}

}

class LinkedListImpl2 {
	Stack<MyNode> stack = new Stack<MyNode>();
	private MyNode head;

	// inset node
	public void insert(MyNode node) {
		if (head == null) {
			head = node;
		} else {
			MyNode last = head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = node;
		}

	}

	public void reverseSubPart() {
		// System.out.println(" Begin reverseSubPart ");
		MyNode current = head;
		MyNode previous = head;
		while (current != null) {
			// System.out.println(" reverseSubPart while : current "+current);
			if (current.data % 2 == 0) {
				// System.out.println("Got even !!!");
				current = reverse(previous, current);
				// break;
			}
			previous = current;
			current = current.next;
		}

	}

	public MyNode reverse(MyNode previous, MyNode current) {
		MyNode end = null;
		MyNode start = previous;
		boolean isheadChanged = false;

		if (current == head) {
			isheadChanged = true;
			// System.out.println("#######Head modified");
		}

		// System.out.println("previous:"+previous);
		// System.out.println("current:"+current);

		while (current != null && current.data % 2 == 0) {
			// System.out.println("Push "+current);
			stack.push(current);
			current = current.next;
			end = current;
		}

		// System.out.println("Done Push!!!");

		if (isheadChanged)
			head = stack.peek();
		// MyNode topElem = stack.peek();
		// head = topElem;

		while (!stack.isEmpty()) {
			MyNode popped = stack.pop();
			// System.out.println("Pop "+popped);
			// System.out.println("previous:"+previous);
			previous.next = popped;
			previous = popped;

		}

		// System.out.println("start:"+start);
		// System.out.println("end:"+end);

		previous.next = end;
		return previous;
	}

	public void display() {
		MyNode current = head;
		while (current != null) {
			System.out.print(current);
			current = current.next;
		}
	}

}

class MyNode {

	public int data;
	public MyNode next;

	public MyNode() {
	}

	public MyNode(int data) {
		this.data = data;
	}

	public String toString() {
		return data + " ";
	}
}
