package arrays;

import java.util.Comparator;
import java.util.PriorityQueue;

public class FindScores {

	//1. Create Variable Str, low, finalOp
	//2. Traverse each element in loop and find lowest element, store in low
	//3. While choosing low, check if it exists in str
	//4. if low-1<0 or low+1>length-1, write low in str
	//5. if low index=0 write low index, low+1 index separated by , in str
	//6. if low index=length-1 write low index, index-1 separated by , in str
	//7. Continue loop;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindScores s = new FindScores();
		int [] nums = {2,1,3,4,5,2};
		
		System.out.println(s.getMinScore(nums));
		
	}

	
	    public static long getMinScore(int[] nums) {
	        int n = nums.length;
	        boolean[] marked = new boolean[n];
	        long score = 0; // Use long to handle large sums

	        // PriorityQueue to store elements with their index, sorted by value and index
	        PriorityQueue<int[]> pq = new PriorityQueue<>(
	            Comparator.<int[]>comparingInt(a -> a[0])
	                .thenComparingInt(a -> a[1])
	        );

	        // Add all elements with their indices to the queue
	        for (int i = 0; i < n; i++) {
	            pq.offer(new int[]{nums[i], i});
	        }

	        // Process the elements from the queue
	        while (!pq.isEmpty()) {
	            int[] current = pq.poll();
	            int value = current[0];
	            int index = current[1];

	            // Skip if already marked
	            if (marked[index]) continue;

	            // Add the value to the score
	            score += value;

	            // Mark the current and adjacent elements
	            marked[index] = true;
	            if (index > 0) marked[index - 1] = true;
	            if (index < n - 1) marked[index + 1] = true;
	        }

	        return score;
	    }
	}


