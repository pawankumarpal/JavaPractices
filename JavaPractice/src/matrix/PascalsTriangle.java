package matrix;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 5;
		triangle(size);
	}
	
	public static void triangle(int size) {
		//int triangleMatrix [][] = new int [size][];
		List<List<Integer>> triangleMatrix =  new ArrayList<List<Integer>>(size);
		if(size!=0) {
			List<Integer> temp = new ArrayList<Integer>();
			temp = new ArrayList<Integer>();
			for(int i=0;i<size;i++) {	
				if(i==0) {
					temp.add(1);
					triangleMatrix.add(temp);
					temp = new ArrayList<Integer>();
					continue;
				}
				temp.add(1);
				
				for(int j=0;j<triangleMatrix.get(i-1).size()-1;j++) {
					//System.out.println(triangleMatrix.get(i));
					int sum =triangleMatrix.get(i-1).get(j)+triangleMatrix.get(i-1).get(j+1);
					temp.add(sum);
				}
				temp.add(1);
				triangleMatrix.add(temp);
				temp=new ArrayList<Integer>();
			}
		}

		System.out.println(triangleMatrix);
	}
	
	//public void addTemp(List<List<Integer>> triangleMatrix,)

}
