package linkedList;

import linkedList.TreversalListNode.Node;

public class NthElementFromEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NthElementFromEnd ne = new NthElementFromEnd();
		Node head = new Node(1);
		Node ll1 = new Node(2);
		Node ll2 = new Node(3);
		Node ll3 = new Node(4);
		
		head.next = ll1;
		ll1.next = ll2;
		ll2.next = ll3;
		ll3.next = new Node(5);
		ll3.next.next = new Node(6);

		int n =3;
		ne.findNthEle(head, n);
	}
	
	public void findNthEle(Node head, int n){
		
		Node first = head;
		Node sec = head;
		int count = 0;
		
		while(first != null && first.next!=null) {
			first = first.next;
			count++;
			
			if(count>=3) {
				sec = sec.next;
			}
		}
		System.out.println(sec.data);
	}
	
	static class Node{
		int data;
		Node next;
		
		Node(int x){
			data = x;
			next = null;
		}
	}

}
