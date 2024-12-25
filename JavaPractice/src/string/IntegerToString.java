package string;

import java.util.LinkedList;
import java.util.List;

public class IntegerToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		
		LinkedList<Integer> lb = new LinkedList<>();
		lb.add(1);
		lb.add(5);
		lb.add(2);
		System.out.println(ll+","+lb);
		int a = Integer.valueOf(iteratorFn(ll));
		int b = Integer.valueOf(iteratorFn(lb));
		String sum = String.valueOf(a+b);
		System.out.println(sum);
		
		LinkedList<Integer> returnList = new LinkedList<>();
		
		for(int i=sum.length()-1;i>=0;i--)
		{
			System.out.println(sum.charAt(i)+","+i);
			returnList.add(Character.getNumericValue(sum.charAt(i)));
			System.out.println(returnList);
		}
		System.out.println(returnList);
	}
	
	public static String iteratorFn(LinkedList<Integer> arr) {
		String a = "";
		for(int i=arr.size()-1;i>=0;i--) {
			a = a.concat((arr.get(i)).toString());
			
		}
		return a;
	}

}

