package circularLinkedLists;

import circularLinkedLists.TreversalCircular.Node;

public class InsertAtBegin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Created Circular Linked List
		Node head = new Node(1);
		head.next = new Node(2);//head = head.next;
		head.next.next= new Node(5);//head = head.next;
		head.next.next.next= new Node(7);
		head.next.next.next.next= head;
		
		int k = 12;
		InsertAtBegin iab = new InsertAtBegin();
		
		iab.InsertBegin(head, k);
		
	}
	
	/**
	 * Description: Function Prints Linked List Element post Inserting K element at Head position
	 * @param head: Starting point of Linked List
	 * @param k:Value to be inserted at Head position of Linked List
	 * 
	 * 1. Creted Node for New Element
	 * 2. Providing next value to this Node for head.next
	 * 3. Now I want head.next = temp because it will be next to head
	 * 4. Now I swaped temp and head
	 */
	public void InsertBegin(Node head,int k) {
		Node temp = new Node(k);
		
		temp.next = head.next;
		head.next = temp;
//		curr.next = temp;
//		temp.next = head;
//		
		int headVal = head.data;
		head.data = temp.data;
		temp.data = headVal;
		isCircular(head);
	}
	public void isCircular(Node head) {
		if(head ==null) return ;
		
		Node curr = head;
		
		do {
			System.out.println(curr.data);
			curr =curr.next;
		}while(curr !=head);
	}
	
	//Node class which provide data at particular node and switch to next node
//	static class Node{
//		int data;
//		Node next;
//		
//		Node(int x){
//			data = x;
//			next =null;
//		}
//		
//	}

}
