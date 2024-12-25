package arrays;

import java.util.Arrays;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums1 [] = {1,2};
		int nums2 [] = {3,4};
		double a = findMedianSortedArrays(nums1,nums2);
		System.out.println(a);
	}
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
	      int arr[] = new int [nums1.length+nums2.length];
	      int count = 0;
	      for (int i=0;i<nums1.length;i++){
	        arr[i]= nums1[i];
	        System.out.println(i+"--"+arr[i]);
	        count++;
	      }

	      for(int j =0;j<nums2.length;j++){
	        arr[count] = nums2[j];
	        System.out.println(count+"--"+arr[count]);
	        count++;
	      }
	      Arrays.sort(arr);
	      System.out.println("AFTER SORTING");
	      for(int i=0;i<arr.length;i++) {
		      System.out.println(i+"--"+arr[i]);
 
	      }
	      if(arr.length==3){
	        return arr[1];
	      }else{
	        int arrLength = arr.length;
	        double median= 0d;
	        if(arrLength%2==0){
	        	System.out.println("Y"+arrLength+"A"+arr[(arrLength/2)-1]+"B"+arr[arrLength/2]);
	        	System.out.println((arr[(arrLength/2)-1]+arr[arrLength/2]));
	         median = (arr[(arrLength/2)-1]+arr[arrLength/2])/2d;
	         System.out.println(median);
	        }else{
	            median = (arr[arrLength/2]);
	        }

	        return median;
	      }
	  
	    }

}
