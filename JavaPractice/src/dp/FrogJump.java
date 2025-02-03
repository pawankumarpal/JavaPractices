package dp;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FrogJump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height[]= {10,30,40,20,50};
    	int [] memo = new int [height.length];
    	//IntStream.range(0,memo.length).forEach(i->memo[i]=-1);
    	//Arrays.stream(memo).forEach(s->memo[s]=-1);
    	
    	memo[0]=0;
    	
    	for(int i=1;i<height.length;i++) {
    		
    		int fs = memo[i-1]+Math.abs(height[i]-height[i-1]);
    		
    		int ss = Integer.MAX_VALUE;
    		if(i>1) ss= memo[i-2]+ Math.abs(height[i]-height[i-2]);
    		memo[i]= Math.min(fs, ss);
    	}
        System.out.println(memo[height.length-1]);
	}
    
//    static int recur(int[] height, int n,int [] memo){
//    	if(n==0) memo[n]=n;
//
//    	for(int i=1;i<memo.length-1;i++) {
//            int left = memo[i-1]+ Math.abs(height[n]-height[n-1]);
//            int right=Integer.MAX_VALUE;
//            if(n>1){
//               right = recur(height,n-2,memo)+ Math.abs(height[n]-height[n-2]);
//            }  
//            
//            memo[i]=Math.min(left,right);
//    	}
//
//    }

}
