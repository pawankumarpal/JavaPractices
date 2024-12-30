package hashing;

import java.util.HashSet;
import java.util.List;

public class HashSetTreversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numsHash = (List<Integer>) new HashSet<Integer>();
		numsHash.add(1);
		numsHash.add(2);
		numsHash.add(1);
		System.out.println(numsHash);
//		for(int i=0;i<numsHash.size();i++)
//		System.out.println(i);
	}

}
