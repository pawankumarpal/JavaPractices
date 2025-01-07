package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.printer.PrintArray;

public class SubStringMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubStringMatching sb = new SubStringMatching();
		String [] str = {"mass","as","hero","superhero"};
//		Arrays.sort(str);
//		Arrays.re
//		
//		PrintArray pa = new PrintArray();
		//pa.printSimpleStringArray(str);        
		String sbs = "";
		List<String> matchStr = new ArrayList<String>();
		for(int i=0;i<str.length;i++) {
			sbs+= str[i];
		}
		for(int i=0;i<str.length;i++) {
			if(sbs.indexOf(str[i]) != sbs.lastIndexOf(str[i])) {
				matchStr.add(str[i]);
			}
		}
		
		System.out.println(matchStr );

//		matchStr.
////		String left= str[0];
////		String right = str[str.length-1];
//		System.out.println(sb.stringMatching(str,matchStr,0, str.length-1));
	}


}
