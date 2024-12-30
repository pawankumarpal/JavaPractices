package linkedList;


public class ReverseLl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseLl re = new ReverseLl();
		Node head = new Node(1);
		Node ll1 = new Node(2);
		Node ll2 = new Node(3);
		Node ll3 = new Node(4);
		
		head.next = ll1;
		ll1.next = ll2;
		ll2.next = ll3;
		ll3.next = new Node(5);
		ll3.next.next = new Node(6);
		System.out.println("ORIGINAL");
		re.printLinkedList(head);
		
		re.Reversing(head, null);
	}
	
	public void Reversing(Node head, Node prev) {
		if(head ==null) {
			System.out.println("Empty LL");
		}
		if(head.next==null) {
			Node curr = head;
			head.next = prev;
			System.out.println("REVERSED");
			printLinkedList(head);
		}
		Node next = head.next;
		head.next = prev;
//		prev = head;
		Reversing(next, head);
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
	static class Node{
		int data;
		Node next;
		//yes
		Node(int x){
			data =x;
			next =null;
		}
		
	}

}
