package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateUsingHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ArrayList<Integer> list = new ArrayList<>( Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));
		 Set<Integer> s = new LinkedHashSet<>();
		 System.out.println(list);
		 s.addAll(list);
		 
		 list.clear();
		 
		 list.addAll(s);
		 System.out.println(list);
		 }

}
