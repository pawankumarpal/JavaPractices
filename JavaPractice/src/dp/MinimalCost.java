package dp;

import java.util.stream.IntStream;

import com.printer.PrintArray;

public class MinimalCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,30,40,50,20};
		int k=3;
		int dp[] = new int[arr.length];
		IntStream.range(0, arr.length).forEach(s->dp[s]=-1);
		dp[0]=0;
		System.out.println(recu(k,arr,arr.length-1, dp));
	}
	
    public static int recu(int k,int arr[], int n,int dp[]){

    	for(int i=1;i<n;i++) {
    		int minSteps = Integer.MAX_VALUE;
    		
    		for(int j=1;j<=k;j++) {
    			if(i-j>=0) {
        			int val = dp[i-j]+ Math.abs(arr[n]-arr[n-j]);
        			minSteps = Math.min(minSteps, val);	
    			}
    		}
    		dp[i] = minSteps;
    	}
        return dp[n-1];
    }
    
//    public static int recu(int k,int arr[], int n,int dp[]){
//        if (n == 0) return 0;
//        if(dp[n] !=-1) return dp[n];
//        int min = Integer.MAX_VALUE;
//        for(int i=1;i<=k;i++){
//        	if(n-i>=0) {
//                int value = recu(k,arr,n-i,dp) + Math.abs(arr[n]-arr[n-i]);
//                min = Math.min(min,value);
//        	}else {
//        		break;
//        	}
//
//        }
//        return min;
//    }
}
