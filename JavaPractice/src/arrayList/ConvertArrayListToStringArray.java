package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayListToStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> list = new ArrayList<>( Arrays.asList("Anshul Aggarwal", "Pawan", "Vinay"));
		 System.out.println(list);
		 
		 //Method1, user defined
		 /**
		 String [] arr = new String[list.size()];
		 for(int i =0;i<list.size();i++) {
			 arr[i] = list.get(i);
		 }
		 System.out.println(arr);*/
		 
		 //Method 2- toArray Method
		/** 
		 String k[] = list.toArray(new String[list.size()]);
		 printList(k);
		 */
		 
		 //Method3 - copyOf
		 /**
		 String k[] = Arrays.copyOf(list.toArray(), list.size(),String[].class);
		 printList(k);
		 */
		 
		 //Array sublist- returns portion of List between indexes
		 List<String> arrlist2 = list.subList(2, 4);

	        List<List<Integer>> returnList = new ArrayList<List<Integer>>();
	        List<Integer> newList = new ArrayList<>(2);
	        newList.add(1);
	        newList.add(2);
	        
	        returnList.add(newList);
	        newList.clear();
	}
	
	public static void printList(String[]k) {
		for (String str : k) {
			 
            // Printing the elements in above array
            System.out.println(str);
        }
	}

}
