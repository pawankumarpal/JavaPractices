package arrays;

public class LongestConsecutive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class Solution {
	    public int countConsecutive(int [] nums,int currentIndex, int count, 
	    int max){
	        if(currentIndex == nums.length-1){
	            if(count>max){
	                max = count;
	            }
	            return max;
	        }
	        if(nums[currentIndex]+1!= nums[currentIndex+1]){
	            if(count>max){
	                max = count;
	            }
	            count =1;
	            return countConsecutive(nums,currentIndex+1,count,max);
	        }else{
	            count++; 
	            return countConsecutive(nums,currentIndex+1,count,max);
	        }  
	    }
	}
}
