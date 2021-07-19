package ds.linkedlist;

import java.util.Scanner;

public class LinkedListRemoveFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tests = sc.nextInt();


        while (tests-- != 0) {
            //Read operation
            int len = sc.nextInt();
            int frnds = sc.nextInt();
            FBLinkedList linkedList = new FBLinkedList();
            for (int i = 0; i < len; i++) {
                linkedList.insert(new FNode(sc.nextInt()));
            }


            linkedList.unfriend(frnds);
            linkedList.display();


        }

    }
}


class FBLinkedList {
    private FNode head;

    public void insert(FNode node) {
        if (head == null) {
            head = node;
        } else {
            FNode last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = node;
        }

    }

    public void unfriend(int frnds) {
        //System.out.println("Freinds to e removed : "+frnds);

        while (frnds != 0) {
            FNode current = head;
            FNode previous = head;

            //System.out.println("Iteration ######"+frnds);
            while (current.next != null) {
                //System.out.println("current.data:"+current.data+" current.next.data:"+current.next.data);
                if (current.data < current.next.data) {
                    if (current == head) {
                        head = current.next;
                    } else {
                        previous.next = current.next;
                    }
                    current = current.next;
                    frnds--;
                    //System.out.println("current"+current+" previous:"+previous);
                    break;
                } else {
                    previous = current;
                    current = current.next;
                    //System.out.println("current"+current+" previous:"+previous);
                }

            }

            if (current.next == null && frnds != 0) {
                previous.next = null;
                break;
            }

            //previous.next = null;
            //break;
        }
    }


    public void display() {
        FNode current = head;
        while (current != null) {
            System.out.print(current);
            current = current.next;
        }
        System.out.println("");
    }
}


class FNode {

    public int data;
    public FNode next;

    public FNode() {
    }

    public FNode(int data) {
        this.data = data;
    }

    public String toString() {
        return data + " ";
    }
}
