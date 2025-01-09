package recursion;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		System.out.println(fact(num));
	}
	
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
		int ans = n*fact(n-1);// WHAT IS REALLY HAPPENING IN FACTORIAL = N*(N-1)......
		return ans;
	}

}
