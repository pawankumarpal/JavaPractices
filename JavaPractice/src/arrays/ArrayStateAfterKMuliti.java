package arrays;

public class ArrayStateAfterKMuliti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayStateAfterKMuliti ar = new ArrayStateAfterKMuliti();
		int [] nums = {1,2};
		int k =3;
		int multi = 4;
		ar.getFinalState(nums, k, multi);
		ar.printArray(nums);
	}
	
	public void getFinalState(int [] nums, int k, int multiplier) {
        if(nums.length==0 || k==0 || multiplier ==0){
            return ;
        }
		if(k>0) {
			int length = nums.length-1;
			int min= nums[0];
			int index=0;
			for(int i=1;i<=length;i++) {
				if(nums[i]<min) {
					min= nums[i];
					index =i;
				}
			}
			nums[index]=min*multiplier;
			
			getFinalState(nums, k-1, multiplier);
		}
	}

	
	public void printArray(int [] nums) {
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+",");
		}
	}

}
