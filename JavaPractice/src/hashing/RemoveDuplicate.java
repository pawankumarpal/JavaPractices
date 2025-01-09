package hashing;

import java.util.Arrays;
import java.util.HashSet;

import com.printer.PrintArray;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums [] = {0,0,1,1,1,2,2,3,3,4};
		
		PrintArray pa= new PrintArray();
		pa.printSimpleImtArray(removeDuplicates(nums));
	}
    public static int[] removeDuplicates(int[] nums) {
        HashSet<Integer> no = new HashSet<Integer>();
        int index = 0;
        for(int i=0;i<nums.length;i++){
        	if(i<nums.length-1&&nums[index]==nums[i+1]) {
        		nums[index]=nums[i];
        		index++;
        	}else {
        		
        	}
            //no.add(nums[i]);
        }
//        //int newNum[] = new int [no.size()];
//        int i=0;
//        for (int ele : no) {
//            // Print HashSet data
//            nums[i++]=ele;
//            //System.out.print(ele + " ");
//            
//        }
//        Arrays.sort(nums, 0, no.size());
		return nums;
    }
}
