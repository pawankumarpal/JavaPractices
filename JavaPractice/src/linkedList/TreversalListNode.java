package linkedList;

import com.printer.PrintArray;

public class TreversalListNode{
	public static void main (String[] args) {
		TreversalListNode tl = new TreversalListNode();
		Node head = new Node(1);
		Node ll1 = new Node(2);
		Node ll2 = new Node(3);
		Node ll3 = new Node(4);
		
		head.next = ll1;
		ll1.next = ll2;
		ll2.next = ll3;
		ll3.next = null;
		
		tl.printLinkedList(head);
		
	} 
	static class Node{
		int data; //Declaring data
		Node next;
		
		Node(int x){     //IN Node if Some int value passes , it will be set as data for same
			data =x;
			next = null;//Next will point to null
		}
	}
	public void printLinkedList(Node head) {
		String array = "[";
		Node temp = head;
		while(temp !=null) {
			array=array.concat(temp.data+",");
			temp = temp.next;
		}
		array=array.trim();
		array=array.concat("]");
		System.out.println("Your Array:"+array);
	}
	
}
