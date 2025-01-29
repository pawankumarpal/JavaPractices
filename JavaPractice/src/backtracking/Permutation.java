package backtracking;

import java.util.ArrayList;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums [] = {1,0,-1,0,-2,2};
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		recurPermutation(0, nums, ans);
		System.out.println(ans);
		
	}
	
	public static void recurPermutation(int index, int nums[], ArrayList<ArrayList<Integer>> ans) {//index-0,1
		if(index==nums.length) {
			ArrayList<Integer> temp = new ArrayList<Integer>();
			
			for(int i=0;i<nums.length;i++) {
				temp.add(nums[i]);
			}
			ans.add(new ArrayList<>(temp));
			return ;
		}
		
		for(int j=index;j<nums.length;j++) {
			swap(j,index,nums);
			recurPermutation(index+1, nums, ans);
			//System.out.println(ans);
			swap(index, j, nums);
		}
	}
	
	public static void swap(int i, int j, int nums[]) {
		int temp = nums[i];
		nums[i]= nums[j];
		nums[j]= temp;
	}
	

}
