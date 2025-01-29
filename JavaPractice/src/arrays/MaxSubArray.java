package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

import com.printer.PrintArray;
//nased 
public class MaxSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
		
		System.out.println(maxSubArray(nums));
	}
	
	public static int maxSubArray(int[] nums) {
        int currSum = nums[0];
        int maxSum =nums[0];
    	//System.out.println("CURR SOME"+currSum+ "  MAX SUM:"+maxSum);

        for(int i=1;i<nums.length;i++){
        	currSum = Integer.max(nums[i], currSum+nums[i]);
        	maxSum = Integer.max(maxSum, currSum);
        	System.out.println("CURR SOME"+currSum+ "  MAX SUM:"+maxSum);
        }
		return maxSum;
//        Arrays.sort(nums);
//        PrintArray pa = new PrintArray();
//        pa.printSimpleImtArray(nums);
//        int arr[] = IntStream.rangeClosed(1, nums.length).map(i -> nums[nums.length-i]).toArray();;
//        pa.printSimpleImtArray(arr);
//        int sum=0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]<=0){
//                return sum;
//            }
//            sum +=arr[i]; 
//        }
//        return sum;
    }

}
