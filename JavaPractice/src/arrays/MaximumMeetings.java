package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class MaximumMeetings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start[] = {25, 0, 14, 24, 18, 3, 17};//{0,3,14,17,18,24,25}
		Arrays.sort(start);
		int end[] =   {29, 25, 24, 26, 25, 23, 18};
		HashMap<Integer,Integer> tracking = new HashMap<Integer,Integer>();
		Queue<Integer> q = new LinkedList<Integer> ();
//		q.add(null)
		for(int i=0;i<start.length;i++) {
			tracking.put(start[i], end[i]);
		}
		sortbykey(tracking);
		maxMeetings(tracking,start);
	}
	   public static void sortbykey(HashMap<Integer,Integer> tracking)
	    {
	        ArrayList<Integer> sortedKeys
	            = new ArrayList<Integer>(tracking.keySet());
	 
	        Collections.sort(sortedKeys);
	
	    }
	
	static void swap(int end[], int i,int j) {
		
	}
    public static void maxMeetings(HashMap<Integer,Integer> tracking,int start[]) {
        
        ArrayList<Integer> endTime =  new ArrayList<Integer>();
        ArrayList<Integer> counts = new ArrayList<Integer>();
        endTime.add(tracking.get(start[0]));
        counts.add(1);
        System.out.println("ENDTIME:"+endTime);
        System.out.println("ENDTIMEcount:"+counts);

        boolean flag = false;
        for(int i=1;i<start.length;i++){
            for(int j=0;j<endTime.size();j++){
                if(endTime.get(j)<start[i]){
                    endTime.set(j,tracking.get(start[i]));
                    int temp =counts.get(j)+1;
                    counts.set(j, temp);
                    System.out.println("IN_ENDTIME:"+endTime);
                    System.out.println("IN_ENDTIMEcount:"+counts);
                    flag = true;
                    break;
                }   
            }
            if(flag ==false){
                endTime.add(tracking.get(start[i]));
                counts.add(1);
            }else
            flag = false;
        }
      System.out.println(Collections.max(counts));
    }
}
