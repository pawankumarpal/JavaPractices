package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import com.printer.PrintArray;

public class CapitalCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintArray pa = new PrintArray();
		int [] num = {1,2,3,4,5};
		int [] mum = Arrays.copyOf(num, 0);
		pa.printSimpleImtArray(num);
		Arrays.setAll(num, i->num[i]=0);

		
		
		String letter = "aaAbcCABBc";
		int count=0;
		HashMap <String,Integer>countList = new HashMap<String,Integer>();
		for(int i=0;i<letter.length();i++) {
			if(Character.isLowerCase(letter.charAt(i))) {
				String letterI = letter.charAt(i)+"";
				for(int j=i+1;j<letter.length();j++) {
					
					String letterJ = letter.charAt(j)+"";
					if(Character.isUpperCase(letter.charAt(j)) && letterJ.equalsIgnoreCase(letterI) && !countList.containsKey(letterJ)) {
						countList.put(letterJ, 1);
					}else if(!Character.isUpperCase(letter.charAt(j)) && letterJ.equalsIgnoreCase(letterI) && countList.containsKey(letterJ.toUpperCase())) {
						countList.put(letterJ.toUpperCase(), 0);
					}
				}
			}

		}
		int sum = 0;
		for (int f : countList.values()) {
		    sum += f;
		}
		System.out.println(sum);
	}

}
