package heap;
import java.io.PrintStream;

import com.printer.*;
import heap.Heap;

public class MinHeapify {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinHeapify mh = new MinHeapify();
		PrintArray pa = new PrintArray(); 
		int arr[] = { 100, 4, 51, 6, 7, 3, 9, 1 };
		/*
		 * 		     		  2
		 * 				4			51
		 * 			6	  7	      3		9
		 * 		1
		 * 
		 * Your Array:[4,6,51,1,7,3,9,100,]
		 * 
		 * 		     		  
		 * 				4			51
		 * 			6	  7	      3		9
		 * 		1
		 */
		Heap h = new Heap(arr.length);
		int i = 0;
		mh.minHeapify(i,arr,h);
		int a = 7;
		mh.printSimpleImtArray(arr);
	}
	public void printSimpleImtArray(int [] arr) {
		String array = "[";
		for(int i=0;i<arr.length;i++) {
			array=array.concat(arr[i]+",");
		}
		array=array.trim();
		array=array.concat("]");
		System.out.println("Your Array:"+array);
	}

	void minHeapify(int i, int [] arr,Heap h) {
		int left = h.left(i), right = h.right(i), smallest = i;

		if (left < arr.length && arr[left] < arr[i])
			smallest = left;
		if (right < arr.length && arr[right] < arr[smallest])
			smallest = right;
		if (smallest != i) {
			swap(smallest, i,arr);
			minHeapify(smallest,arr,h);
		}
	}
	
	void swap(int smallest,int i, int [] arr) {
		int temp = arr[smallest];
		arr[smallest] = arr[i];
		arr[i] = temp;
	}

}
