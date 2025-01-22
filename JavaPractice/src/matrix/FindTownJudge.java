package matrix;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FindTownJudge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int trust [] [] = {{1,3},{2,3},{3,1}};
		int n =3;
//		int trust [] [] = {{1,3},{2,3}};
//		int n =3;
//		int trust [] [] = {{1,3},{2,3},{1,4},{2,4},{4,3}};
//		int n =4;
		System.out.println(findJudge(n, trust));
	}
	
    public static int findJudge(int n, int[][] trust) {
    	//if(trust.length>=n) return -1;
        HashMap<Integer,Integer> trustMap= new HashMap<Integer,Integer>();
        for(int i =0;i<trust.length;i++){
        	
        	if(!trustMap.containsKey(trust[i][1])) {
            trustMap.put(trust[i][1],1);
            trustMap.put(trust[i][0],-1);
            }else if(trustMap.get(trust[i][1]) !=-1){
                trustMap.put(trust[i][1],trustMap.get(trust[i][1])+1);
                trustMap.put(trust[i][0],-1);
            }else {
            	 trustMap.put(trust[i][0],-1);
            }
        }
        System.out.println(trustMap);
        if(Collections.max(trustMap.values())==n-1) return Collections.max(trustMap.entrySet(), Map.Entry.comparingByValue()).getKey(); 
        else return -1;
    }

}
