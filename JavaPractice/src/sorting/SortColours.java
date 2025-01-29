package sorting;

import com.printer.PrintArray;

public class SortColours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintArray pa = new PrintArray();
		int nums[] = {2,0,2,1,1,0};
		sortColors(nums);
		pa.printSimpleImtArray(nums);
	}
	 public static void sortColors(int[] nums) {
	        int[] counts = new int[3];

	        for (int num : nums) {
	            counts[num]++;
	        }
	        int index = 0;
	        int numIndex =0;
	        while(index<counts.length) {
	        	if(counts[index]>0) {
	        		nums[numIndex]=index;
	        		counts[index]--;
	        		numIndex++;
	        	}
	        	if(counts[index]==0) {
	        		index++;
	        	}
	        }
	        //2,2,2
//	        int index = 0;
//	        for (int i = 0; i < 3; i++) {
//	            for (int j = 0; j < counts[i]; j++) {
//	                nums[index++] = i;
//	            }
//	        }

	 }
}
