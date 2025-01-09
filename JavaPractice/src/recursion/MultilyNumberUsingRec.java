package recursion;

public class MultilyNumberUsingRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 23424;
		int num2 = 542;
		
		System.out.println(calcMultiple(num1, num2));
	}
	
	public static int calcMultiple(int num1,int num2) {
		int multip =0;
		if(num2 ==0) {
			return multip;
		}
		multip +=num1 +calcMultiple(num1, num2-1);
		
		return multip;
	}

}
