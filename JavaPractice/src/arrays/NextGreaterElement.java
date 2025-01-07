package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;
import java.util.stream.IntStream;

import com.printer.PrintArray;

public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NextGreaterElement nge = new  NextGreaterElement();
		PrintArray pa = new PrintArray();
//		int nums1[] = {4,1,2}; 
//		int nums2[] = {1,3,4,2};
		int nums1[] = {2,4}; 
		int nums2[] = {1,2,3,4};
		int prefix[] = new int [nums2.length];
		
		pa.printSimpleImtArray(nge.nextGreaterElement(nums1,nums2));
	}
	
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        
        // Traverse nums2 from right to left
        for (int i = nums2.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums2[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                map.put(nums2[i], stack.peek());
            } else {
                map.put(nums2[i], -1);
            }
            stack.push(nums2[i]);
        }

        // Prepare the result array for nums1
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }
        
        return result;
    }

	/*
	public void prefixArr(int nums2[], int [] prefix) {
		for(int i=0;i<nums2.length;i++) {
			for(int j=i+1;j<nums2.length;j++) {
				if(nums2[j]>nums2[i]) {
					prefix[i]=nums2[j];
					break;
				}
			}
			if(prefix[i]==0) {
				prefix[i]=-1;
			}
			
			//calculating(nums2, nums2, prefix);
		}
	}
	public int [] calculating(int [] nums1,int nums2[],int prefix[]) {
		int indexArr [] = new int [nums1.length];
        for(int j=0;j<nums1.length;j++){
        	int num = nums1[j];
            int index = IntStream.range(0, nums2.length).filter(i-> num==nums2[i]).findFirst().orElse(-1);
            indexArr[j]=prefix[index];
        }
        return indexArr;
	}*/

}
