package string;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class ZigZagConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "PAYPALISHIRING";
		int a = 3;
		
		StringBuilder [] rows = new StringBuilder[a];
        // Assign values to the array
        for (int i = 0; i < a; i++) {
            rows[i] = new StringBuilder();  // Assign dynamic values

        }
        
        int currRow =0;
        boolean goingDown = false;
        
        for(char c:s.toCharArray()) {
        	rows[currRow].append(c);
        	
        	if(currRow==0 || currRow ==a-1) {
        		goingDown = !goingDown;
        	}
        	currRow += goingDown?1:-1;
        	System.out.println(currRow);
        	System.out.println(rows[currRow]);

        }
        System.out.println(rows);
        
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }
        System.out.println(result);
        /**String[] strings = new String[a];

        // Assign values to the array
        for (int i = 0; i < a; i++) {
            strings[i] = "";  // Assign dynamic values

        }
		
		int iterator = a+(a-2);
		System.out.println(iterator);
		String comma = "";
		List<Integer> list = new ArrayList<>();
		int count =0;
		for(int i=0;i<s.length();i++) {
				
			if(i==0) {
				comma=comma.concat(String.valueOf(s.charAt(0))).concat(",");
			}else {
				
				//System.out.println(s.charAt(i));
				i= i+(iterator-1);
				System.out.println(i);
				if(i>s.length()) {
					count++;
					comma=comma.concat(String.valueOf(s.charAt(count))).concat(",");
				}
				if(i>s.length()) {
					break;
				}
				comma=comma.concat(String.valueOf(s.charAt(i))).concat(",");
				System.out.println("Count:"+count);
				list.add(i-1);
				list.add(i+1);
				//extraCount=String.valueOf(i-count)+","+String.valueOf(i+count);
				//comma=comma.concat(String.valueOf(s.charAt(i+count))).concat(",");
				System.out.println(i);	
				
			}
			System.out.println("Comma:"+comma);
			//System.out.println(i);	
			//System.out.println("Extra count:"+list);
			


		}
		System.out.println(comma);
		int countS = 1; 
		for(int k =0;k<list.size();k++) {
			if(k%2==0) {
				//comma = comma.concat(String.valueOf(s.charAt(countS))).concat(",");
				countS++;
				//System.out.println("Comma inside count:"+comma);
				
			}
			comma = comma.concat(String.valueOf(s.charAt(list.get(k)))).concat(",");
			System.out.println("Comma inside k:"+comma);
			String elementK = String.valueOf(s.charAt(list.get(k)));
			String elementCount = String.valueOf(s.charAt(s.length()-1));
			if(elementK.equalsIgnoreCase(elementCount)){
				count++;
				comma = comma.concat(String.valueOf(s.charAt(count))).concat(",");
			}
		}
		System.out.println("Comma:"+comma);*/
	}

}
