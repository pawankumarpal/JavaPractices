package hashing;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class IntegerToRoman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "M";
		String n="3749";
		for(int i=0;i<3;i++) {
			n=n.concat(a);
		}
		System.out.println(n);
	}
	
	public String romanValue(int num) {
		//CREATING MAP OF Symbol and Values
        HashMap<Integer,String> symbolValue = new HashMap<Integer,String>();
        symbolValue.put(1000, "M");
        symbolValue.put(900, "CM");
        symbolValue.put(500, "D");
        symbolValue.put(400, "CD");
        symbolValue.put(100, "C");
        symbolValue.put(90, "XC");
        symbolValue.put(50, "C");
        symbolValue.put(40, "XL");
        symbolValue.put(10, "X");
        symbolValue.put(4, "IV");
        symbolValue.put(1, "I ");
        String roman="";
        for (Iterator<Entry<Integer, String>> iterator = symbolValue.entrySet().iterator(); iterator.hasNext(); ) {
            Entry<Integer, String> e = iterator.next();
            int value = e.getKey();
            while (num >= value) {
                roman += e.getValue();
                num -= value;
            }
        }
        System.out.println();
        





//        HashMap<Integer,Integer> symbolValue = new HashMap<Integer,Integer>();
//        symbolValue.put(3:1000);symbolValue.put("V":5);
//        symbolValue.put("X":10);

        int numArray [] = {0,10,100,1000};
        String romanString = "";
        int number = num;
        
//String.ValueOf(num).size()
        int numSize = String.valueOf(num).length();
        for(int i=0;i< numSize;i++){
            int divisor =number/numArray[numSize-1]; 
            number = num%numArray[numSize-1];
//
//            if(number<1000 && parse (String.valueOf(num).charAt(0)) ){
//
//            }
            
            if(divisor>1){
                for(int j=0;j<divisor;j++){
                    romanString+=symbolValue.get(numArray[numSize-1]);
                }
            }
        }
		return romanString;

	}

}
