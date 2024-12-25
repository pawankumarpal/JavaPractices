package searchAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5,7,8,9,10};// o/p-[4,8,41]
		int number = 10;
		
		int[] newArr = Arrays.copyOf(arr, arr.length);
		Arrays.sort(newArr);// {1,2,4,5,5,8,23,41,53,76}
		
		List<List<Integer>> triplets = new ArrayList<>();
		
		int left= 0;
		int right=arr.length-1;
		
		for(int i=0;i<right;i++) {
			left = i+1;
			while(left<right) {
				if(arr[left]+arr[right]+arr[i]==number) {
					List<Integer> temp = new ArrayList<Integer>();
					temp.add(arr[left]);temp.add(arr[right]);temp.add(arr[i]);
					triplets.add(temp);
					break;
				}
				
				if (newArr[left] + newArr[right]+arr[i] > number) {
					right--;
				} else if (newArr[left] + newArr[right] +arr[i]< number) {
					left++;
				}
			}
		}
		System.out.println(triplets);
		
	}
	
}
