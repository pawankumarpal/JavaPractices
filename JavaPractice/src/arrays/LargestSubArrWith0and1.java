package arrays;

public class LargestSubArrWith0and1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {0,1,1,0,0,1,1,0,0};
		for(int i:arr) {
			if(arr[i]==0) {
				arr[i]=-1;
			}
		}
		int sum =0;
		int count=0;
		for(int j=0;j<arr.length;j++) {
			sum+=arr[j];
			if(j!=0 && sum==0) {
				count++;
			}
		}
		System.out.println(count);
	}
	

}
