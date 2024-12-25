package hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class FindNumberOfDistinctElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,1,1,3,4,2,4,5,6,7,8,4};
		
		HashSet<Integer> distinctElements = new HashSet<Integer>();
		for(int i:arr) {
			distinctElements.add(arr[i]);
		} 
		System.out.println("Distinct Elements:"+distinctElements);
	}

}
