package arrays;

import com.printer.PrintArray;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {-1,-100,3,99};
		PrintArray pa = new PrintArray();
		rotate(nums, 2);
		pa.printSimpleImtArray(nums);
	}
    public static void rotate(int[] nums, int k) {
        int right = nums.length-(k+1);//3
        int last = nums[right];//4
        System.out.println(right+","+last);
        for(int i=0;i<right;i++){//[0,2]
            swap(i,right,nums);
        }
        nums[nums.length-1] = last;
    }

    static void swap(int i, int right, int nums[]){
        int temp = nums[i];//1
        nums[i] = nums[right+i+1];//[0]=5
        nums[right+i] = temp;//[3]=1
    }

}
