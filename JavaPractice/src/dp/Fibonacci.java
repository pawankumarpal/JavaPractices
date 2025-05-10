package dp;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a  =5;
		int[] dp = new int [a+1];
		
	      for(int i=0;i<=a;i++) dp[i]=-1;
	      
	      dp[0]=0; dp[1]=1;
			System.out.println(rec(a, dp));

	}
    
    static long rec(int n, int [] dp){
        if(dp[n]==-1){
            int res;
            if(n==0 || n==1){
                res = n;
            }else{
                res = (int)(rec(n-1,dp)+rec(n-2,dp));
            }
            dp[n]=res;
        }
        return dp[n];
    }


}
