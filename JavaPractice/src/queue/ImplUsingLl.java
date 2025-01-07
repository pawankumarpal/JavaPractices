package queue;

public class ImplUsingLl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(5);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(5);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(5);
		
		System.out.println("SIZE:"+q.size);
		
		while(q.front!=null) {
			System.out.println(q.dequeue());
		}
	}
	static class Node{
		int data;
		Node next;
		
		Node(int x){
			data = x;
			next = null;
		}
	}
	
	static class Queue{
		int size;
		Node front,rear;
		
		Queue(int x){
			size=0;
			front = rear = null;
		}
		
		void enqueue(int x) {
			size++;
			Node temp = new Node(x);
			if(front ==null) {
				front = rear = temp;
				return ;
			}
			rear.next = temp;
			rear = temp;	
		}
		
		int dequeue() {
			if(front ==null) {
				return -1;
			}
			int head = front.data;
			front = front.next;
			return head;
		}
	}
}
