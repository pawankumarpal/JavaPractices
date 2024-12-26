package string;

import java.util.Arrays;
import java.util.HashMap;

import com.printer.PrintArray;

public class AnagramOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnagramOrNot an = new AnagramOrNot();
		String s1 = "gfg";
		String s2 = "ggf";
		//System.out.println(s2.charAt(0) - 'a');
		if(s1.length()==s2.length())
		System.out.println(an.checking(s1, s2));
		else
			System.out.println("false");

	}

	public String checking(String s1, String s2) {
		PrintArray pa = new PrintArray();
		
		//Method3
		int [] charCount = new int [26];
		
		for(int i=0;i<s1.length();i++) {
			charCount[s1.charAt(i)-'a']++;
			//pa.printSimpleImtArray(charCount);
			charCount[s2.charAt(i) - 'a']--;
			//pa.printSimpleImtArray(charCount);
		}
		
        for (int count : charCount) {
            if (count != 0) return "false";
        }
/*
 * 		Method2
		//Time Complexity -O(n) ,space- O(k) 
		HashMap<Character, Integer> s1Map = new HashMap<Character, Integer>();
		HashMap<Character, Integer> s2Map = new HashMap<Character, Integer>();
		for (int i = 0; i < s1.length(); i++) {
			s1Map.put(s1.charAt(i), s1Map.containsKey(s1.charAt(i)) ? s1Map.get(s1.charAt(i))+1 : 1);
			s2Map.put(s2.charAt(i), s2Map.containsKey(s2.charAt(i)) ? s2Map.get(s2.charAt(i))+1 : 1);
		}
		if(!s1Map.equals(s2Map)) return "false";*/
		
/**		System.out.println(s1Map);
		System.out.println(s2Map);*/

		//Method1
		// Using Normal Naive Solution Time: O(nlogn) , Space: O(n)
//		String [] s1Arr = new String[s1.length()];
//		String [] s2Arr = new String[s1.length()];
//
//		for(int i=0;i<s1.length();i++) {
//			s1Arr[i]=String.valueOf((s1.charAt(i)));
//			s2Arr[i]=String.valueOf((s2.charAt(i)));
//		}
//		Arrays.sort(s1Arr);
//		Arrays.sort(s2Arr);
//		
//		for(int j=0;j<s1Arr.length;j++) {
//			if(!s1Arr[j].equalsIgnoreCase(s2Arr[j])) {
//				return "false";
//			}
//		}

		return "true";
	}

}
