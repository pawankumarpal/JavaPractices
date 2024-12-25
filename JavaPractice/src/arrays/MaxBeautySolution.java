package arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class MaxBeautySolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxBeautySolution m = new MaxBeautySolution();
		int [] nums= {12,71};
		int k=10;
		int value= m.maxBeauty(nums,k);
		System.out.println(value);
	}
	
	public int maxBeauty(int[] nums, int k) {

//		Set<Integer> s = Arrays.stream(nums).boxed().collect(Collectors.toSet());
//        
//        // If all elements are same, size of
//        // HashSet should be 1. As HashSet contains only distinct values.
//        if(s.size() == 1) {
//        	return nums.length;};
//		
//		int [][] arr = new int [nums.length][2];
//		for(int i=0;i<nums.length;i++) {
//			if(nums[i]-k>=0) {
//				arr[i][0]=nums[i]-k;
//				arr[i][1]= nums[i]+k;
//				//System.out.println(arr[i][0]+","+arr[i][1]);
//			}else {
//				arr[i][0]=-1;
//				arr[i][1]= -1;
//			}
//		}
//		//printArr(arr);
//		int count=0;
//		int sum=0;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i][0]!=-1) {
//				sum+=arr[i][0]+arr[i][1]; 
//				count++;
//			}
//		}
//		int avg=sum/(count*2);
//		System.out.println(avg);
//		count=0;
//		for(int l=0;l<nums.length;l++) {
//			if(arr[l][0]!=-1 && avg>=arr[l][0] && avg<=arr[l][1]) {
//				nums[l]= avg;
//				count++;
//			}
//		}
//		//System.out.println(count);
//		return count;
        // Sort the array to use sliding window efficiently
        Arrays.sort(nums);

        int maxBeauty = 1;  // The beauty of the array can be at least 1
        int n = nums.length;

        // Two pointers to represent the sliding window
        int left = 0;
        
        // Iterate with the right pointer
        for (int right = 0; right < n; right++) {
            // Check if the difference between nums[right] and nums[left] 
            // can be adjusted by applying the range [-k, +k]
        	System.out.println(nums[right]+","+ nums[left]);
            while (nums[right] - nums[left] > 2 * k) {
                left++;  // Shrink the window from the left
            }
            // Update the maximum beauty (the length of the current window)
            maxBeauty = Math.max(maxBeauty, right - left + 1);
        }

        return maxBeauty;
        
	}
	
	public void printArr(int [][] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i][0]+","+arr[i][1]);
		}
	}
	

}
