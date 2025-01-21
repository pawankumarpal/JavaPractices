package matrix;

import java.util.Collections;
import java.util.HashMap;

public class FindTownJudge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int trust [] [] = {{1,3},{2,3},{3,1}};
		int n =3;
//		int trust [] [] = {{1,3},{2,3}};
//		int n =3;
		findJudge(n, trust);
	}
	
    public static void findJudge(int n, int[][] trust) {
        HashMap<Integer,Integer> trustMap= new HashMap<Integer,Integer>();
        for(int i =0;i<trust.length;i++){
        	
            trustMap.put(trust[i][1],!trustMap.containsKey(trust[i][1])?1:trustMap.get(trust[i][1])+1);
        }
        System.out.println(trustMap);
        if(Collections.max(trustMap.values())==n-1 && Collections.max(trustMap.keySet())) System.out.println(Collections.max(trustMap.keySet())); 
        else System.out.println(-1);
    }

}
