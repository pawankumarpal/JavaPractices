package string;
import java.io.*;

public class LongestSubstringWithoutRepeating {

	/**public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "aab";

        String largestString = "";
        for(int i=0;i<s.length();i++){
            String tempLargestString = "";
                tempLargestString =String.valueOf(s.charAt(i));
                //System.out.println(tempLargestString);

                //System.out.println(tempLargestString.length()); 
            for(int j =i+1;j<s.length();j++){
                if(!tempLargestString.contains(String.valueOf(s.charAt(j)))){
                    tempLargestString +=String.valueOf(s.charAt(j)) ;
                   // System.out.println(tempLargestString);
                }else {
                	break;
                }
            }
            if(tempLargestString.length()>largestString.length()){
                largestString=tempLargestString;
            }
        }
        System.out.println(largestString);
        System.out.println(largestString.length());
    }*/
	
	public static void main(String[] args) {
        String s = "aab";

        int start = 0, maxLength = 0;
        String largestString = "";

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            // Check for duplicate character in the current window
            for (int k = start; k < end; k++) {
                if (s.charAt(k) == currentChar) {
                    // Move the start of the window to exclude the duplicate
                    start = k + 1;
                    break;
                }
            }

            // Calculate the current length of the window
            int currentLength = end - start + 1;

            // Update the largest substring if a new maximum is found
            if (currentLength > maxLength) {
                maxLength = currentLength;
                largestString = s.substring(start, end + 1);
            }
        }

        System.out.println(largestString);
        System.out.println(maxLength);
    }
}

