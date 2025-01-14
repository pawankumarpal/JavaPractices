package string;

import java.util.ArrayList;
import java.util.Collections;

public class ConstructKthPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "leetcode";
		int k=3;
		
		System.out.println(canConstruct(s, k));
	}

    public static boolean canConstruct(String s, int k) {
        //int counts[] = new int [26];
        ArrayList<Integer>
                    counts = new ArrayList<>(Collections.nCopies(26, 0));    
        if(s.length()==k) return true;
        else if (s.length()<k) return false;
        for(int i=0;i<s.length();i++){
		    counts.set(s.charAt(i)-'a',(counts.get(s.charAt(i)-'a'))+1);
            //counts[s.charAt(i)-'a']++;
        }
        
        System.err.println(counts);

        int odds =0;
        for(int j=0;j<counts.size();j++){
            if(odds>k){
                return false;
            }
            if(counts.get(j)%2 !=0){
                odds++;
            }
        }

        boolean flag = false;
        for(int z =0;z<counts.size();z++){
            if(counts.get(z)>1){
                flag =true;
                break;
            }
        }
        if(flag ==false) return false;
        return true;
    }
}
