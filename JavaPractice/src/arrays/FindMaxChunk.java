package arrays;

public class FindMaxChunk {

	// 1. Get mid
	// 2. check left and right is in sorted manner or not
	// 3. if mid-1>=0 and mid+1 >length
	// 4. Start Binary Search on both side
	// 5. If Descripency divide array in two and check in all arrays
	// 6. In last if descrepency not found
	// sort all arrays and add together if array is found in sorted way return no of
	// arrays
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4,3,2,1,0 };
		int chunks=0;
		int max=0;
		
		for(int i=0;i<arr.length;i++) {
			max=Math.max(max,arr[i]);
			if(max==i) {
				chunks++;
			}
		}
		System.out.println(chunks);
	}

}
