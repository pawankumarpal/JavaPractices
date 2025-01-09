package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombiningNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String digits = "2";
		System.out.println(letterCombinations(digits));
	}
    public static List<String> letterCombinations(String digits) {
    	List<String> combinations = new ArrayList<String>();
        if(digits.isEmpty()) return combinations;
        String number []= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        if(digits.length()==1) {
        	String s = number[Integer.valueOf(digits.charAt(0)+"")];
        	return (Arrays.asList(s.split("")));
        }
        
        int length = (number[Integer.valueOf(digits.charAt(0)+"")]).length();
        int secondIndex = Integer.valueOf(digits.charAt(1)+"");
        String finalStr = "";
        for(int i=0;i<length;i++){
            finalStr += ((number[secondIndex]).replace("",","+number[Integer.valueOf(digits.charAt(0)+"")].charAt(i)));
            finalStr = finalStr.substring(0, finalStr.length() - 2);

        }
        //finalStr = finalStr.substring(0, finalStr.length() - 2);
        finalStr = finalStr.substring(1, finalStr.length());

        System.out.println(finalStr);
        String finArr[] = finalStr.split(",");
        combinations = Arrays.asList(finArr);
        return (combinations);
        


    }

}
