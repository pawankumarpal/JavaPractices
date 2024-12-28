package linkedList;

import com.printer.PrintArray;

public class LinkedListTreversal {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			PrintArray pa = new PrintArray();
			Node head = new Node(10);
			head.setNext(new Node(20));
			head.getNext().setNext(new Node(30));
			head.getNext().getNext().setNext(new Node(40));
			head.getNext().getNext().getNext().setNext(new Node(20));
			pa.printLinkedList(head);
		}

}
