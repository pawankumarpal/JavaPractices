package queue;

public class ImplUsingCircularArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue(5);
		q.enqueue(1);q.enqueue(2);q.enqueue(3);q.enqueue(4);q.enqueue(5);
		
		for(int i=0;i<q.size-1;i++) {
			System.out.println(q.dequeue());
		}
	}
	
	static class Queue{
		int front,rear,size,cap;
		
		int[] arr;
		
		Queue(int c){
			cap =c;
			size =0;
			front =0;
			arr = new int [cap];
		}
		
		void enqueue(int x) {
			if(isFull()) {
				return ;
			}
			rear = (rear+1)%cap;
			arr[rear] = x;
			size++;
		}
		
		int dequeue() {
			int head = arr[front];
			front =  (front+1)%cap;
			return head;
		}
		
		int getRear() {
			if(isEmpty()) return -1;
			return (front+size-1)%cap;
		}
		
		boolean isEmpty() {
			return size==0;
		}
		boolean isFull() {
			return cap==size;
		}
	}
}
