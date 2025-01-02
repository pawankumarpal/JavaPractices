package stacks;

import java.util.Stack;

public class MatchingParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatchingParanthesis mp = new MatchingParanthesis();
		String paranthesis = "[({)]";
		String opens = "[{(";
		Stack <Character> s = new Stack<Character>();
		
		int i=0;
		while(i<paranthesis.length()) {
			if(opens.contains(String.valueOf(paranthesis.charAt(i)))) {
				s.push(paranthesis.charAt(i));
				
			}else {
				if(paranthesis.isEmpty()) {
					System.out.println(false);
					break;
				}else if(!mp.isMatching(s.peek(),paranthesis.charAt(i))){
					System.out.println(false);
					break;
				}else {
					s.pop();
				}
			}
			i++;
		}
		System.out.println(s.isEmpty()?true:false);

	}

	public boolean isMatching(char a, char b) {
		if (a == '{' && b == '}') {
			return true;
		}else if (a == '[' && b == ']') {
			return true;
		}else if (a == '(' && b == ')') {
			return true;
		}
		return false;
	}
}
