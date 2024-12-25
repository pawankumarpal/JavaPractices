package hashing;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class UnderstandHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
//        TreeMap<Integer,String> symbolValue = new TreeMap<Integer,String>();
//      symbolValue.put(1000, "M");
//      symbolValue.put(900, "CM");
//      symbolValue.put(500, "D");
//      symbolValue.put(400, "CD");
//      symbolValue.put(100, "C");
//      symbolValue.put(90, "XC");
//      symbolValue.put(50, "C");
//      symbolValue.put(40, "XL");
//      symbolValue.put(10, "X");
//      symbolValue.put(4, "IV");
//      symbolValue.put(1, "I ");        
        for (Entry<Integer, String> e : symbolValue.entrySet()) {
        	int value = e.getKey();
        }
	}

}
