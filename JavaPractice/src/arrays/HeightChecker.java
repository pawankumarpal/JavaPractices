package arrays;

import java.util.Arrays;

public class HeightChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] heights = {1,1,4,2,1,3};
		HeightChecker h = new HeightChecker();
		System.out.println(h.heightsChecker(heights));
	}
    public int heightsChecker(int[] heights) {
    	int sortedArray[] = heights.clone();
    	 Arrays.sort(sortedArray);
        int length = heights.length;
        int count =0;
        for(int i=0;i<length;i++){
            if(heights[i]!=sortedArray[i]){
                count++;
            }
        }
        return count;
    }

}
