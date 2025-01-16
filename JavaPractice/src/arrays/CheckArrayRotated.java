package arrays;

public class CheckArrayRotated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] nums= {2,1,3,4};
		 System.out.println(check(nums));
	}
    public static boolean check(int[] nums) {
        int length = nums.length;
        int point =-1;
        for(int i=0;i<length-1;i++){
            if(nums[i]>nums[i+1]){
                point = i;
                break;
            }
        }

        if(point ==-1) return true;
        
        for(int j=0;j<point;j++){
            if(nums[j]>nums[j+1]) return false;
        }
        for(int k=point+1;k<length-1;k++){
            if(nums[k]>nums[k+1]) return false;
        }
        if(nums[0]<nums[length-1])return false; 
        return true;
    }
    

}
