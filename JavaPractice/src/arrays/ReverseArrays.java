package arrays;

import com.printer.PrintArray;

public class ReverseArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseArrays ra = new ReverseArrays();
		PrintArray pa = new PrintArray();
		char s []= {'H','a','n','n','a','h'};
		pa.printSimpleCharArray((ra.reverseChar(s, 0, s.length-1)));
		
	}
	
	public char[] reverseChar(char s[], int left, int right) {
		if(left <=right) {
			char temp =s[left];
			s[left] = s[right];
			s[right] = temp;
			reverseChar(s, left+1, right-1);
			
		}else {
			return s;
		}
		return s;
		
	}

}
