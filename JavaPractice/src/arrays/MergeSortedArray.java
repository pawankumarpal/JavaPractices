package arrays;

import java.util.Arrays;
import java.util.HashMap;

import com.printer.PrintArray;

public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSortedArray msa = new MergeSortedArray();
		int nums1[] = {1,2,3,0,0,0};
		int nums2 [] = {2,5,6};
		
		msa.merge(nums1, 0, nums2, 0);
		
	}

    public void merge(int[] nums1, int m, int[] nums2, int n) {
    	PrintArray pa  = new PrintArray();
		int j=0;
    	for(int i=0;i<nums1.length;i++) {
    		pa.printSimpleImtArray(nums1);

    		if(nums1[i]==0) {
    			nums1[i]= nums2[j];
    			j++;
    		}
    	}
    	Arrays.sort(nums1);
    	
    	pa.printSimpleImtArray(nums1); //[1,2,2,3,5,6]
//        HashMap <Integer,Integer> countMap = new HashMap<Integer,Integer>();
//
//        for(int i =0;i< nums1.length;i++){
//            if(!(i >=nums1.length)){
//                int key = nums1[i];
//                //checking if key exists add 1 else just put 1
//                countMap.put(key, 
//                (countMap.containsKey(key)?(countMap.get(key))+1:1));
//            }
//            if(!(i >=nums2.length)){
//                int key = nums2[i];
//                //checking if key exists add 1 else just put 1
//                countMap.put(key, 
//                (countMap.containsKey(key)?(countMap.get(key))+1:1));
//            }
//        }
//        for(int j =0;j<countMap.size();j++){
//            int k =0;
//            for(;k<countMap.)
//        }
    }
}
