package stacks;

import java.util.HashMap;
import java.util.Stack;

public class InfixToPostFix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InfixToPostFix iftpf = new InfixToPostFix();
		//String st = "a+b*c";
		//String st = "";
		//String st = "(a+b)*c";
		String st = "a+b/c-d*e";
		HashMap<Character, Integer> precedent = new HashMap<Character, Integer>();
		precedent.put('-', 1);
		precedent.put('+', 2);
		precedent.put('/', 3);
		precedent.put('*', 4);
		System.out.println(iftpf.formPostFix(st, precedent));
		
	}

	public String formPostFix(String str, HashMap<Character,Integer> prec) {
		Stack<Character> s  = new Stack<Character>();
		String postFix = "";
		if(str.isEmpty()) {
			return "Blank String";
			
		}else {
			int i =0;
			while(i<str.length()) {
				//System.out.println(str.charAt(i));
				//System.out.println(s);
				if(str.charAt(i) =='(') {
					s.push(str.charAt(i));
				}else if(str.charAt(i) ==')'){
					while(s.peek()!='(') {
						postFix +=s.pop();
					}
					s.pop();
				}else if(!prec.containsKey(str.charAt(i)) && (str.charAt(i) !='(' ||str.charAt(i) !=')')) {
					postFix +=str.charAt(i);
				}else if(s.isEmpty()){
					s.push(str.charAt(i));
				}else {
					char top = s.peek();
					if(prec.containsKey(top) && prec.get(str.charAt(i))<prec.get(top)) {
						while(!s.isEmpty() && prec.get(str.charAt(i))<prec.get(top) ) {
							postFix +=s.pop();
							
							if (!s.isEmpty())top = s.peek();
						}
						s.push(str.charAt(i));
					}else {
						s.push(str.charAt(i));
					}
				}
				i++;
			}
			while(!s.isEmpty()) {
				postFix+=s.pop();
			}
		}return postFix;
}

}
