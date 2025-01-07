package circularLinkedLists;

import java.util.HashMap;

import circularLinkedLists.TreversalCircular.Node;
import linkedList.TreversalListNode;

public class DeleteKthNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeleteKthNode dke = new DeleteKthNode();
		Node head = new Node(1);
		head.next = new Node(2);//head = head.next;
		head.next.next= new Node(5);//head = head.next;
		head.next.next.next= new Node(7);
		head.next.next.next.next= new Node(9);
		head.next.next.next.next.next= head;
		
		int n =2;
		
		System.out.println(5/1);
		//dke.DeletedList(head, n);
		
	}

	public void DeletedList(Node head, int n) {
		Node curr = head;
		for(int i=0;i<n-2;i++) {
			curr = curr.next;
		}
		curr.next = curr.next.next;
		//TreversalListNode tn = new TreversalListNode();
		printLinkedList(head);
	}
	
	public void printLinkedList(Node head) {
		String array = "";
		Node temp = head;
		do {
			array=array.concat(temp.data+",");
			temp =temp.next;
		}while(temp !=head);
		array.trim();
		System.out.println("Your Array:"+array);
	}
}
