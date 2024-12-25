package hashing;

import java.util.HashMap;

public class ContFreqEachElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,1,1,3,4,2,4,5,6,7,8,4};
		HashMap<Integer,Integer> countFreq = new HashMap<Integer,Integer>();
		
		for(int i:arr) {
			countFreq.put(arr[i], countFreq.get(arr[i]) == null ? 1 : countFreq.get(arr[i]) + 1);

		}
		
		System.out.print(countFreq);
	}

}
