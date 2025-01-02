package stacks;

import java.util.Stack;

public class Treverse {

	//Stacks can be implemented as ArrayList and LinkedList in Java
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stc = new Stack<Integer>();
		stc.push(1);stc.push(2);stc.push(3);stc.push(4);stc.push(5);
		
		while(!stc.isEmpty()) {
			System.out.println(stc.pop());
		}
	}
	
}
