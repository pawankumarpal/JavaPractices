package recursion;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 6;// 01123 ,, num- find element at position num
		System.out.println(printFibnc(num));
	}
	
	public static int printFibnc(int num) {
		if(num==0 || num ==1) {
			return num;
		}
		int ans = printFibnc(num-1)+printFibnc(num-2);
		return ans;
	}

}
