package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ListIterator;

public class ReverseOfArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 ArrayList<Integer> list = new ArrayList<>( Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));
		 System.out.println(list);
		 
		 
		//Method1
		 
		 /**ArrayList<Integer> newlist = new ArrayList<>();
		 	for(int i = list.size()-1;i>0;i--) {
			 newlist.add(list.get(i));
		 }
		 System.out.println(newlist);*/
		 
		 //Method2
		 /**
		 Collections.reverse(list);
		 System.out.println(list);
		 */
		 
		 //Method 3
		 
		 ListIterator iterator=list.listIterator(list.size());
		 System.out.println(iterator);
		 while(iterator.hasPrevious())
	      {
	        System.out.println(iterator.previous());
	      }
		
		
	}

}
