package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import com.printer.PrintArray;

public class WordSubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words1[] = { "amazon", "apple", "facebook", "google", "leetcode" };
		String words2[] = { "lo", "eo" };
		String s = "dsfjsdhfkadgskfdsakfuskdgfsdfdsgsk";
//		ArrayList<Integer> arrayList = new ArrayList<>(Collections.nCopies(26, 0));    
//		arrayList.set(s.charAt(6)-'a',(arrayList.get(s.charAt(6)-'a'))+1);
//		arrayList.contains(2);
//        System.out.println(arrayList);
		System.out.println(wordSubsets(words1, words2));
	}

	public static List<String> wordSubsets(String[] words1, String[] words2) {
		PrintArray pa = new PrintArray();
		        List<String> universalList = new ArrayList<String>();
		        if(words1.length == 0 || words2.length == 0) return universalList;

		        // Creating the frequency count for each character in words2
		        int[] maxFreq = new int[26];
		        for(String word : words2) {
		        	System.out.println(word);
		            int[] freq = new int[26];
		            for(char c : word.toCharArray()) {
		                freq[c - 'a']++;
		            }
			        pa.printSimpleImtArray(freq);

		            for(int i = 0; i < 26; i++) {
		                maxFreq[i] = Math.max(maxFreq[i], freq[i]);
		            }
		        }
		        pa.printSimpleImtArray(maxFreq);
		        // Check each word in words1
		        for(String word : words1) {
		            int[] freq = new int[26];
		            for(char c : word.toCharArray()) {
		                freq[c - 'a']++;
		            }
		            
		            System.out.println("FOR WORDS1:"+word);
			        pa.printSimpleImtArray(freq);

		            boolean universal = true;
		            for(int i = 0; i < 26; i++) {
		                if(freq[i] < maxFreq[i]) {
		                    universal = false;
		                    break;
		                }
		            }
		            if(universal) {
		                universalList.add(word);
		            }
		        }

		        return universalList;

//		PrintArray pa = new PrintArray();
//		List<String> universalList = new ArrayList<String>();
//		// base case
//		if (words1.length == 0 || words2.length == 0)
//			return universalList;
//		int chars = 0;
//		int matchingCount []= new int [words1.length] ;
//		for (int i = 0; i < words2.length; i++) {
//			HashMap<Character, Integer> countMap = new HashMap<Character, Integer>();
//			for (int j = 0; j < words2[i].length(); j++) {
//				Character key = words2[i].charAt(j);
//				countMap.put(key, countMap.containsKey(key) ? countMap.get(key) + 1 : 1);
//				chars += countMap.containsKey(key) ? countMap.get(key) + 1 : 1;
//			}
//			int temp [] = new int  [words1.length] ;
//	        for (Entry<Character,Integer> e : countMap.entrySet()) {
//	        	String key = e.getKey().toString();
//	        	int value = e.getValue();
//	        	//System.out.println(value);
//				for (int k = 0; k < words1.length; k++) {
//					int word1Count = words1[k].replaceAll("[^"+key+"]", "").length();
//					if(word1Count>=value) {
//						temp[k] = temp[k]+1;
//					}
//				}
//	        }
//	        for(int x =0;x<temp.length;x++) {
//	        	if(temp[x]==countMap.size()) {
//	        		matchingCount[x] = matchingCount[x]+1;
//	        	}
//	        }
//
//		}
//		
//		for(int z=0;z<matchingCount.length;z++) {
//			if(matchingCount[z]==words2.length) {
//				universalList.add(words1[z]);
//			}
//			
//		}
//
//		// Creating String to be iterated
////        String word2 = "";
////        for(int z =0;z<words2.length;z++) {
////        	word2+=words2[z];
////        }
////        
////        //Pre loop computations
////        int [] countArray = new int[words1.length];
////
////        
////        //System.out.println("WORDS2:"+word2);
////        //int word2length =words2.length;
////        for(int i=0;i<word2.length();i++){
////            for(int j=0;j<words1.length;j++){
////            	//System.out.println("WORD1:"+words1[j]);
////            	//System.out.println("WORD2:"+word2.charAt(i)+"");
////                if(words1[j].contains(word2.charAt(i)+"")){
////                	//System.out.println("Inside if");
////                    //universalList.add(words1[j]);
////                    countArray[j] = countArray[j]+1;
////                }
////            }
////        }
////        //pa.printSimpleImtArray(countArray);
////        for(int k =0;k<countArray.length;k++){
////            if(countArray[k]==word2.length()){
////                universalList.add(words1[k]);
////            }
////        }
//		return universalList;
	}

}
