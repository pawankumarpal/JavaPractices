package recursion;

import java.util.HashMap;

public class Print2048 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = false;
		printChars(25560, flag);
	}
	
	public static void printChars(int num, boolean flag) {
		HashMap<Integer,String> alp = new HashMap<Integer,String>();
		alp.put(0, "zero");alp.put(1, "one");alp.put(2, "two");alp.put(3, "three");alp.put(4, "four");alp.put(5, "five");alp.put(6, "six");
		alp.put(7, "seven");alp.put(8, "eight");alp.put(9, "nine");
		
		if(num%10==0 && flag ==true) {
			return ;
		}
		flag = true;
		String val = alp.get(num%10);
		printChars(num/10,flag);
		System.out.println(val);
	}

}
