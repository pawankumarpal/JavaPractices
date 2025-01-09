package recursion;

import java.time.LocalDateTime;

public class NumberPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 2;
		int pow = 850;
		System.out.println(LocalDateTime.now());
		System.out.println(calcVal(num, pow));
		System.out.println(LocalDateTime.now());
		System.out.println(calcFactPow(num, pow));
		System.out.println(LocalDateTime.now());
	}
	//2^8 = (2^4)^2=(2^2)^4
	//2^8 = (2^8/2)^2
	public static int calcVal(int a,int b) {
		if(b==0) {
			return 1;
		}else {
			return a*calcVal(a,b-1);
		}
		
	}
	
	public static int calcFactPow(int a,int b) {
		if(b==0) {
			return 1;
		}
		
		int smallAns = calcFactPow(a, b/2);
		smallAns *=smallAns;
		
		if(b%2!=0) {
			smallAns = a*smallAns;
		}
		return smallAns;
	}

}
