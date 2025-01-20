package matrix;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CompltelyPaintedRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr [] = {1,3,4,2};
//		int mat[][] = {{1,4},
//					   {2,3}};
		
//		int arr [] = {2,8,7,4,1,3,5,6,9};
//		int mat[][] = {{3,2,5},
//					   {1,4,6},
//					   {8,7,9}};
//		int arr [] = {1,4,5,2,6,3};
//		int mat[][] = {{4,3,5},
//					   {1,2,6}};
		
		int arr [] = {6,2,3,1,4,5};
		int mat[][] = {{5,1},
					   {2,4},
					   {6,3}};
		
		System.out.println(firstCompleteIndex(arr, mat));
	}
    public static int firstCompleteIndex(int[] arr, int[][] mat) {
        int rows = mat.length, cols = mat[0].length;
        Map<Integer, int[]> positionMap = new HashMap<>();
        int[] rowCount = new int[rows];
        int[] colCount = new int[cols];
        Arrays.fill(rowCount, cols);
        Arrays.fill(colCount, rows);
        for (int r = 0; r < rows; ++r) {
            for (int c = 0; c < cols; ++c) {
                positionMap.put(mat[r][c], new int[]{r, c});
            }
        }
        System.out.println(positionMap);
        for (int idx = 0; idx < arr.length; ++idx) {
            int[] pos = positionMap.get(arr[idx]);
            System.out.println(rowCount[pos[0]] +"||"+colCount[pos[1]]);
            if (--rowCount[pos[0]] == 0 || --colCount[pos[1]] == 0) {
                return idx;
            }
        }
        return -1;
    	/*
        int rowLength = mat.length;
        int colLength = mat[0].length;
        HashMap<Integer,Integer> rows = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> column = new HashMap<Integer,Integer>();

        for(int i=0;i<rowLength;i++){
            rows.put(i,0);
        }
        for(int i=0;i<colLength;i++){
            column.put(i,0);
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<rowLength;j++){
                for(int k=0;k<colLength;k++){
               
                    if(mat[j][k]== arr[i]) {
                    	rows.put(j,rows.get(j)+1);
                    	column.put(k,column.get(k)+1);
                    }
                    if(rows.get(j)==rowLength) return i;
                    if(column.get(k)==colLength) return i;
//                    else if{
//                        
//                    }
                    
//                    else{
//                       
//                    }
                    System.err.println(i);
                    System.out.println(rows);
                    System.out.println(column);

                }
            }
        }
        return 0;*/
    }

}
