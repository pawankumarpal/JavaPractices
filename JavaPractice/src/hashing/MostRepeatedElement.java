package hashing;

import java.util.HashMap;

public class MostRepeatedElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int [] arr = {1,2,1,1,3,4,2,4,5,6,7,8,4};
		HashMap<Integer,Integer> countFreq = new HashMap<Integer,Integer>();
		
		for(int i:arr) {
			countFreq.put(arr[i], countFreq.get(arr[i]) == null ? 1 : countFreq.get(arr[i]) + 1);
//			if(countFreq.get(arr[i]) == null) {
//				countFreq.put(arr[i], null)
//			}

		}
//		int max = countFreq.keySet();
//		for(int i=0;i<countFreq.size();i++) {
//			if(max!=0) {
//				
//			}
//		}
//		System.out.print(countFreq.);
	}

}
