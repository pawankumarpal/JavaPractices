package heap;

/*
*Manually Implemented Heap 
*/
public class Heap {
	int arr[];
	int size, cap;
	Heap(int c){
		arr = new int[c];
		size=0;
		cap = c;
	}
	//Return Index of left node
	int left(int i) {
		return 2*i+1;
	}
	//Return Index of Right Node
	int right(int i) {
		return 2*i+2;
	}
	//Return Index of Parent Node
	int parent(int i) {
		return ((i-1)/2);
	}
}
