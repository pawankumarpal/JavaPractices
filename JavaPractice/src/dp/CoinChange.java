package dp;

public class CoinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] memo = {1,2};//111,12,
        int n = 3;
        System.out.println(rec(memo,memo.length,n));
	}

    public static int rec(int[] memo,int length,int n){
        if(n==0) return 1;
        if(length== 0) return 0;

        int res = rec(memo, length-1,n);
        if(memo[length-1]<=n){
            res= res + rec(memo, length,n-memo[length-1]);
        }
        return res;
    }

}
