package arrays;

import com.printer.PrintArray;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { -1, -100, 3, 99 };
		PrintArray pa = new PrintArray();
		rotate(nums, 2);
		pa.printSimpleImtArray(nums);
	}

	public static void rotate(int[] nums, int k) {
		int n = nums.length;
		k %= n;
		reverse(nums, 0, n - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, n - 1);
	}

	public static void reverse(int[]nums,int start,int end){
    	while(start<end){
    	int temp=nums[start];
    	nums[start]=nums[end];
    	nums[end]=temp;
    	start++;
    	end--;
    	}
	}

}
