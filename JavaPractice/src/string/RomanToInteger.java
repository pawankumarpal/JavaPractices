package string;

import java.util.HashMap;

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RomanToInteger rts = new RomanToInteger();
		String s = "MCMXCIV";
		System.out.println(rts.romanToInt(s));
	}
    public int romanToInt(String s) {
        int sum =0;
        if(!s.isEmpty()){
        HashMap <Character,Integer> map = new HashMap<Character,Integer>();
        map.put('M',1000);map.put('D',500);map.put('C',100);
        map.put('L',50);map.put('X',10);map.put('V',5);map.put('I',1);

        for(int i=0;i<s.length();i++){
            sum+=map.get(s.charAt(i));
        }
        }
        return sum;
    }

}
