package arrays;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class KthLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [] nums =  {-1,2,0};
//		int k = 3;
		int [] nums =  {3,3,3,3,4,3,3,3,3};
		int k = 1;
		System.out.println(findKth(nums, k));
    }
	
	public static int findKth(int[] nums,int k) {
        if(nums[0]==Arrays.stream(nums).max().getAsInt()) return nums[0];
		for(int j=0;j<k-1;j++) {
            //System.out.println(Arrays.stream(nums).max().getAsInt());
			int max = IntStream.range(0, nums.length)
			        .filter(i -> (Arrays.stream(nums).max().getAsInt())== nums[i])
			        .findFirst() // first occurrence
			        .orElse(-1);
			nums[max] = Integer.MIN_VALUE;
		}


        //System.out.println(nums);
		
		int max =Integer.MIN_VALUE;
		for(int i=0;i<nums.length;i++) {
            System.out.println(nums[i]);
			max = nums[i]>max?nums[i]:max;
		}
		//System.out.println(max);
        return max;
	}

}
