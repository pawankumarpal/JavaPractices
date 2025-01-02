package string;

import java.util.HashMap;

public class MinWindowSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinWindowSubString minWin = new MinWindowSubString();
		String s ="ADOBECODEBANC";
		String t ="ABC";
		
		System.out.println(minWin.minWindow(s, t) );
		
	}
	
	public String minWindow(String s, String t) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
//		map.put
		
		for(char c: s.toCharArray()) {
			map.put(c,0);
		}
		
		for(char c:t.toCharArray()) {
			map.put(c, map.get(c)+1);
		}
		
		int start =0;int end=0;int minStart=0;int maxlength = Integer.MAX_VALUE; int count = t.length();
		
		while(end<s.length()) {
			
			char c1 = s.charAt(end);
			if(map.get(c1)>0) {
				count--;
			}
			map.put(c1, map.get(c1)-1);
			end++;
			
			while(count ==0) {
				if(maxlength>end-start) {
					maxlength = end-start;
					minStart=start;
				}
				
				char c2 = s.charAt(start);
				if(map.get(c2)>0) {
					count++;
				}
				start++;
			}
		}
		
		return maxlength == Integer.MAX_VALUE?"":s.substring(minStart,maxlength+minStart);
	}
	/**
	public String minWindow(String s, String t) {
	    HashMap<Character,Integer> map = new HashMap();
	    for(char c : s.toCharArray())
	        map.put(c,0);
	    for(char c : t.toCharArray())
	    {
	        if(map.containsKey(c))
	            map.put(c,map.get(c)+1);
	        else
	            return "";
	    }
	    
	    int start =0, end=0, minStart=0,minLen = Integer.MAX_VALUE, counter = t.length();
	    while(end < s.length())
	    {
	        char c1 = s.charAt(end);
	        if(map.get(c1) > 0)
	            counter--;
	        map.put(c1,map.get(c1)-1);
	        
	        end++;
	        
	        while(counter == 0)
	        {
	            if(minLen > end-start)
	            {
	                minLen = end-start;
	                minStart = start;
	            }
	            
	            char c2 = s.charAt(start);
	            map.put(c2, map.get(c2)+1);
	            
	            if(map.get(c2) > 0)
	                counter++;
	            
	            start++;
	        }
	    }
	    return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart,minStart+minLen);
	}*/

}
