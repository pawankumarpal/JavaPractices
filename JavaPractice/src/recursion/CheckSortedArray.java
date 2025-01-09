package recursion;

public class CheckSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,7,5,6};
		
		System.out.println(isSorted(arr,0));
	}
	
	public static boolean isSorted(int [] arr, int n) {
		if(n==arr.length-1) {
			return true;
		}
		if(arr[n]<arr[n+1] && isSorted(arr, n+1)) {
			return true;
		}
		return false;
	}

}
