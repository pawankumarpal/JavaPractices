package linkedList;

import com.printer.PrintArray;

//Creating Node Class
//class Node{
//	int data;
//	Node next;
//	
//	Node(int x){
//		this.data = x;
//		this.next=null;
//		
//	}
//}
public class DetectLoopInLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintArray pa = new PrintArray();
		DetectLoopInLL dll = new DetectLoopInLL();
		Node head = new Node(10);
		head.setNext(new Node(20));
		//Node joinPoint =head.getNext().getNext(); 
		head.getNext().setNext(new Node(30));
		head.getNext().getNext().setNext(new Node(40));
		head.getNext().getNext().setNext(new Node(60));
		Node joinPoint =head.getNext().getNext(); 
		//head.setNext(joinPoint);
		head =dll.makeloop(head, 4);	
		
		//head.getNext().getNext().getNext().setNext(new Node(20));
		pa.printLinkedList(head);
	}
	public Node makeloop( Node head_ref, int k) 
	{ 
	    // traverse the linked list until loop 
	    // point not found 
	    Node temp = head_ref; 
	    int count = 1; 
	    while (count < k)
	    { 
	        temp = temp.getNext(); 
	        count++; 
	    } 
	 
	    // backup the joint point 
	    Node joint_point = temp; 
	 
	    // traverse remaining nodes 
	    while (temp.getNext() != null) 
	        temp = temp.getNext(); 
	 
	    // joint the last node to k-th element 
	    temp.getNext().setNext(joint_point);; 
	    return head_ref;
	} 
	
}
