package circularLinkedLists;

import com.printer.PrintArray;


public class TreversalCircular {
	public static void main (String[] args) {
		TreversalCircular tcll = new TreversalCircular();
		Node head = new Node(1);
		head.next = new Node(2);//head = head.next;
		head.next.next= new Node(5);//head = head.next;
		head.next.next.next= new Node(7);
		head.next.next.next.next= head;
		
//		String array = "[";
//		Node temp = head;
//		while(temp !=null) {
//			array=array.concat(temp.data+",");
//			temp = temp.next;
//
//		}
//		array=array.trim();
//		array=array.concat("]");
//		System.out.println("Your Array:"+array);
		
		tcll.isCircular(head);
		
		
	}
	
	public void isCircular(Node head) {
		if(head ==null) return ;
		
		Node curr = head;
		
		do {
			System.out.println(curr.data);
			curr =curr.next;
		}while(curr !=head);
		
		
		//Naive Solution
//		if(head == null) return false;
//		Node curr = head;
//		System.out.println(curr.data);
//		while(curr.next != null && curr.next != head) {
//			System.out.println(curr.data);
//			curr = curr.next;
//		}
//		if(curr.next == head) return true;
//		return false;

	}
	
	static class Node{
		int data;
		Node next;
		Node(int x){
			data =x;
			next = null;
			
		}
	}
}
