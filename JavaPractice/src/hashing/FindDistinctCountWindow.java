package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import com.printer.PrintArray;

public class FindDistinctCountWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr [] = {11, 68, 25, 7, 96, 29, 66, 52, 43, 29, 52, 76, 76, 61};
		 int k =14;
		 
		 FindDistinctCountWindow fd = new FindDistinctCountWindow();
		 PrintArray pa = new PrintArray();
		 System.out.println(fd.countDistinct(arr, k));
	}

	public ArrayList<Integer> countDistinct(int arr[], int k) {
		ArrayList<Integer> distWinCount = new ArrayList<Integer>();
		int low = 0;
		int high = k;
		boolean reached = false;
		for (int i = 0; i < arr.length; i++) {
			HashSet<Integer> winSet = new HashSet<Integer>();
			for (int j = low; j < high; j++) {
				winSet.add(arr[j]);
			}
			System.out.println(winSet);
			distWinCount.add(winSet.size());
			if(reached) {
				break;
			}
			if(high+1<arr.length) {
				high += 1;	
			}else {
				high = arr.length;
				reached = true;
			}

			low += 1;
		}
		return distWinCount;
	}
}
