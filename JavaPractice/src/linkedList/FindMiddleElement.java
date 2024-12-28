package linkedList;

import com.printer.PrintArray;

public class FindMiddleElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintArray pa = new PrintArray();
		FindMiddleElement fme = new FindMiddleElement();
		Node head = new Node(10);
		head.setNext(new Node(20));
		head.getNext().setNext(new Node(30));
		head.getNext().getNext().setNext(new Node(40));
		head.getNext().getNext().getNext().setNext(new Node(20));
		//pa.printLinkedList(head);
		fme.FindMiddle(head);
	}
	
	public void FindMiddle(Node head) {
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.getNext()!=null) {
			fast =fast.getNext().getNext();
			slow = slow.getNext();
		}
		System.out.println(slow.getData());
	}

}
