package matrix;

public class RotateMatrix90CC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RotateMatrix90CC rc = new RotateMatrix90CC();
		int [][] nums= {{1,2,3},
						{4,5,6},
						{7,8,9}};
		
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums[i].length;j++) {
				int temp =nums[j][i];
				//System.out.println("i,j:"+i+","+j);

				//System.out.println("Temp:"+temp);

				nums[j][i]= nums[i][j];
				nums[i][j] = temp;
			}
		}
		rc.printArray(nums);
		System.out.println("-----------------------");
		//swappig rows
		int last = nums.length-1;
		for(int k=0;k<nums.length;k++) {

			int[] temp = nums[k];
			nums[k] = nums[last];
			nums[k] = temp;
			last --;
		}
		rc.printArray(nums);


	}

	public void printArray(int[][] nums) {
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				System.out.print(nums[i][j]+",");
			}
			System.out.println();
		}

	}

}
