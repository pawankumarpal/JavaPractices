package arrays;

import java.util.ArrayList;

import com.printer.PrintArray;

public class NextPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums [] = {1,2,3,4,5,2,6,7,8};
		ArrayList<Integer> endTime =  new ArrayList<Integer>();
		endTime.add(0);
		endTime.add(0, null);
		nextPermutation(nums);
	}
	 public static void nextPermutation(int[] nums) {
	        int ind1=-1;
	        int ind2=-1;
	        // step 1 find breaking point 
	        for(int i=nums.length-2;i>=0;i--){
	            if(nums[i]<nums[i+1]){
	                ind1=i;
	                break;
	            }
	        }
	        System.out.println("NUMS1:"+ind1);
	        // if there is no breaking  point 
	        if(ind1==-1){
	            reverse(nums,0);
	        }
	        
	        else{
	            // step 2 find next greater element and swap with ind2
	            for(int i=nums.length-1;i>=0;i--){
	                if(nums[i]>nums[ind1]){
	                    ind2=i;
	                    break;
	                }
	            }
		        System.out.println("NUMS2:"+ind2);


	            swap(nums,ind1,ind2);
	            PrintArray pa = new PrintArray();
	            pa.printSimpleImtArray(nums);
	            // step 3 reverse the rest right half
	            reverse(nums,ind1+1);
	            pa.printSimpleImtArray(nums);
	        }
	    }
	 static void swap(int[] nums,int i,int j){
	        int temp=nums[i];
	        nums[i]=nums[j];
	        nums[j]=temp;
	    }
	 static void reverse(int[] nums,int start){
	        int i=start;
	        int j=nums.length-1;
	        while(i<j){
	            swap(nums,i,j);
	            i++;
	            j--;
	        }
	    }

}
