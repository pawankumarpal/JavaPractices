package string;

import java.util.HashMap;
import java.util.Stack;

public class ValidParanthStringValid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = "())(()(()(())()())(())((())(()())((())))))(((((((())(()))))(", 
//				locked = "100011110110011011010111100111011101111110000101001101001111";
//		String s = "())(())((())))(()())())()))))()(", 
//				locked = "11100101100001001111010110101011";
		String s = "())(()(()(())()())(())((())(()())((())))))(((((((())(()))))(", 
				locked = "100011110110011011010111100111011101111110000101001101001111";
		System.out.println(isBalanced(s,locked));
		//System.out.println(canBeValid(s, locked));
	}
    /**public static boolean canBeValid(String s, String locked) {
        HashMap <Character,Integer> map = new HashMap <Character,Integer>();
        int len = s.length();
        //Base Cases
        if(len==1) return false;
        if(len%2!=0) return false;
        if(!locked.contains("1")) return true; 
        boolean isBalance = isBalanced(s,locked);
        if(isBalance==true) return true; 

        for(int i=0;i<len;i++){
            char charctr = s.charAt(i);
            char binary = locked.charAt(i);
            map.put(charctr,(map.containsKey(charctr)?map.get(charctr)+1:1));
            map.put(binary,map.containsKey(binary)?map.get(binary)+1:1);
        }
        int openBrack = map.get('(');
        int closeBrack = map.get(')');
        int zeros = map.get('0');
        int ones = map.get('1');
        if(Math.abs(openBrack-closeBrack)<=zeros) return true;
        else return false;
    }*/
	public static boolean isBalanced(String s, String locked) {
	    int openCount = 0;
	    int closeCount = 0;
	    int changeable = 0;
	    
	    for (int i = 0; i < s.length(); i++) {
	        if (locked.charAt(i) == '0') {
	            changeable++;
	        } else if (s.charAt(i) == '(') {
	            openCount++;
	        } else {
	            closeCount++;
	        }
	    }
	    
	    int minLength = Math.min(openCount, closeCount);
	    openCount -= minLength;
	    closeCount -= minLength;
	    int requiredChanges = openCount + closeCount;
	    
	    return changeable >= requiredChanges;
	}


    
//    public static boolean isBalanced(String s, String locked){
//        Stack <Character> paras = new Stack<Character>();
//        Stack <Integer> digits = new Stack<Integer>();
//        for(int i=0;i<s.length();i++){
//        	if(paras.isEmpty()) {
//        		paras.push(s.charAt(i)); 
//        		digits.push(Integer.valueOf(locked.charAt(i)+""));
//        	}
//            else if(s.charAt(i)!=paras.peek()) { 
//            	paras.pop();
//            	digits.pop();
//            }
//            else {
//            	paras.push(s.charAt(i));
//        		digits.push(Integer.valueOf(locked.charAt(i)+""));
//            }
//        }
//        if(paras.isEmpty()) return true;
//        
//        System.out.println(paras);
//        System.out.println(digits);
//        int count =0;
//        for(int j=0;j<=digits.size();j++) {
//        	if(digits.peek()==0) {
//        		count++;
//        	}
//        	digits.pop();
//        }
//        System.out.println(count);
//        if(count>=(paras.size()/2)) return true;
//        else return false;
//
////        return paras.isEmpty();
//    }

}
