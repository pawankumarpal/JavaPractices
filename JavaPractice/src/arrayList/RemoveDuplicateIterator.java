package arrayList;

import java.util.ArrayList;
import java.util.Arrays;


public class RemoveDuplicateIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Integer> 
         list = new ArrayList<>( Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5)); 
		 
		 System.out.println(list);
		 
		 ArrayList<Integer> newList = new ArrayList<Integer>(); 
		 
		 for(Integer element:list) {
			 if(!newList.contains(element)){
				 newList.add(element); 
			 }
		 }
		 System.out.println(newList);
	}

}
