package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveDuplicateJava8Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ArrayList<Integer> list = new ArrayList<>( Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));
		 System.out.println(list);
		 List<Integer> newlist = list.stream().distinct().collect(Collectors.toList());
		 
		 System.out.println(newlist);
		 
	}

}
