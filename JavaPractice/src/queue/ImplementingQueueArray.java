package queue;

public class ImplementingQueueArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue(5);
		q.enqueue(1);
		System.out.println(q.dequeue());
	}
	
	static class Queue{
		int size,cap;
		int arr[];
		
		Queue(int c){
			cap = c;
			size =0;
			arr = new int[cap];
		}
		
		void enqueue(int x) {
			if(isFull()) {
				return ;
			}
			arr[size] = x;
			size++;
			//cap =size;
		}
		
		int dequeue() {
			if(isEmpty()) return -1;
			int ele = arr[0];
			
			for(int i=0;i<size-1;i++) {
				arr[i]=arr[i+1];
			}
			return ele;
		}
		
		boolean isFull() {
			return cap == size;
		}
		
		boolean isEmpty() {
			return size==0;
		}
	}
}
