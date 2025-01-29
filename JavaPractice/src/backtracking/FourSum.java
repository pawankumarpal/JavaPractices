package backtracking;

import java.util.ArrayList;

public class FourSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums [] = {1,0,-1,0,-2,2};
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> ds = new ArrayList<Integer>();
		boolean check [] = new boolean [nums.length]; 
		
		recurPermutation(nums, ans, ds, check);
		//System.out.println("ANS SIZE:"+ans.size());
		//System.out.println(ans);
		for(int j=0;j<ans.size();j++) {
			ds = new ArrayList<>(ans.get(j));
			int sum = (int) ds.stream()
		            .mapToLong(Integer::longValue)
		            .sum();
			if(sum!=0) {
				ans.remove(j);
				if(j!=0)j=j-1;
			}
		

		}
		//System.out.println("ANS SIZE post:"+ans.size());

		System.out.println(ans);
	}
	
	public static void recurPermutation(int nums[],ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> ds, boolean[] check ) {
		if(ds.size()==4) {
			ans.add(new ArrayList<>(ds));
			return;
		}
		for(int i=0;i<nums.length;i++) {
			if(!check[i]) {
				check[i]=true;
				ds.add(nums[i]);
				recurPermutation(nums, ans, ds, check);
				ds.remove(ds.size()-1);
				check[i]=false;
			}
			
		}
	}

}
