package string;

import java.util.ArrayList;

public class ReverseStringWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReverseStringWords rs = new ReverseStringWords();
		String statement = "My name is Pawan";
		
		ArrayList<String> statements = new ArrayList<String>();
	      for (String word : statement.split(" ")) {
	    	  statements.add(word);
	        }
	   String finalStr =  rs.returnReverse(statements, statements.size()-1, "");  
	   System.out.println(finalStr);  
	}
	
	public String returnReverse(ArrayList<String>statements,int length ,String reverseStatment) {
		if(length<0) {
			return reverseStatment;
		}else {
			reverseStatment +=statements.get(length)+" ";
			return returnReverse(statements, length-1, reverseStatment);
		}
	}

}
