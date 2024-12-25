package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ArrayListIteratorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Created ArrayList of type Integer
		List<Integer> lst = new ArrayList<>();
		
		//Inserted 5 Values
		lst.add(10);
		lst.add(20);
		lst.add(30);
		lst.add(40);
		lst.add(50);
		System.out.println(lst);
		//adding value at particular index;
		lst.add(2,25);
		lst.add(3,2);
		System.out.println(lst);
		
		//removing element as particular Index
		lst.remove(2);
		System.out.println(lst);
		
		//Removing element of particular value
		lst.remove(Integer.valueOf(2));
		System.out.println(lst);
		
		//set(1,20)- method takes two parameter, used to replace value at perticular index
		//this method return value which is being replaced
		int replacedTo = lst.set(2, 25);
		
		System.out.println(lst);
		
		System.out.println(replacedTo);
		
		
		
		//Creating Iterator Object
		Iterator it = lst.iterator();
		
		//hasNext-Hold true till last element of ArrayList
		
		while(it.hasNext()) {
			int x = (Integer)it.next();
			
			if(x>30) {
				//Removes Elements
				it.remove();
			}
		}
		
		System.out.println(lst);
	}

}
