package ds.linkedlist;

public class SinglyLinkedListImplDemo {
	public static void main(String[] args) {

		LinkedListImpl linkedList = new LinkedListImpl();
		linkedList.insert(new Node(10));
		linkedList.insert(new Node(20));
		linkedList.insert(new Node(30));
		linkedList.insert(new Node(40));
		linkedList.insert(new Node(50));
		linkedList.insert(new Node(60));

		linkedList.display();

		linkedList.remove(30);
		linkedList.remove(60);

		linkedList.display();

	}

}

class LinkedListImpl{
	private Node head;

	public void insert(Node node){
		int index=0;

		System.out.println("Inserting value "+node.getData());

		if(head==null){
			head = node;
		}else{
			Node last = head;
			while(last.getNext() != null){
				last =  last.getNext();
				index++;
			}

			System.out.println("Node inserted at location :"+index);
			last.setNext(node);
		}

	}


	public void remove(int value){
		if(head==null){
			throw new RuntimeException("Emmpty Linkedlist!!!");
		}else{
			Node current = head;
			Node previous = head;
			boolean removed =false;

			while(current != null){

				if(current.getData()==value){
					previous.setNext(current.getNext());
					removed=true;
					break;
				}else{
					previous = current;
					current =  current.getNext();
				}

			}


		}
	}

	public void display(){
		Node current = head;

		while(current!=null){
			System.out.println(current);
			current = current.getNext();
		}
	}
}

class Node{

	private int data;
	private Node next;

	public Node(){}

	public Node(int data){
		this.data=data;
	}


	public void setData(int data){
		this.data=data;
	}

	public int getData(){
		return this.data;
	}

	public void setNext(Node next){
		this.next=next;
	}

	public Node getNext(){
		return this.next;
	}

	public String toString(){
		return "Node : "+data;
	}
}