package recursion;

public class PrintAscNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		printAsc(num, 0);
		printDec(num);
	}
	
	
	public static void printAsc(int n,int a) {
		if(n==0) {
			
			return;
		}
		
		printAsc(n-1, 0);
		System.out.println(n);
		
	}
	
	public static void printDec(int n) {
		if(n==0) {
			System.out.println(n);
			return;
		}
		System.out.println(n);
		printDec(n-1);
	}

}
