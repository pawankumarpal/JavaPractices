package matrix;

import com.printer.PrintArray;

/**
 * 2940. Find Building Where Alice and Bob Can Meet
Hard

642

43

Add to List

Share
You are given a 0-indexed array heights of positive integers, where heights[i] represents the height of the ith building.

If a person is in building i, they can move to any other building j if and only if i < j and heights[i] < heights[j].

You are also given another array queries where queries[i] = [ai, bi]. On the ith query, Alice is in building ai while Bob is in building bi.

Return an array ans where ans[i] is the index of the leftmost building where Alice and Bob can meet on the ith query. If Alice and Bob cannot move to a common building on query i, set ans[i] to -1.

 

Example 1:

Input: heights = [6,4,8,5,2,7], queries = [[0,1],[0,3],[2,4],[3,4],[2,2]]
Output: [2,5,-1,5,2]
Explanation: In the first query, Alice and Bob can move to building 2 since heights[0] < heights[2] and heights[1] < heights[2]. 
In the second query, Alice and Bob can move to building 5 since heights[0] < heights[5] and heights[3] < heights[5]. 
In the third query, Alice cannot meet Bob since Alice cannot move to any other building.
In the fourth query, Alice and Bob can move to building 5 since heights[3] < heights[5] and heights[4] < heights[5].
In the fifth query, Alice and Bob are already in the same building.  
For ans[i] != -1, It can be shown that ans[i] is the leftmost building where Alice and Bob can meet.
For ans[i] == -1, It can be shown that there is no building where Alice and Bob can meet.
Example 2:

Input: heights = [5,3,8,2,6,1,4,6], queries = [[0,7],[3,5],[5,2],[3,0],[1,6]]
Output: [7,6,-1,4,6]
Explanation: In the first query, Alice can directly move to Bob's building since heights[0] < heights[7].
In the second query, Alice and Bob can move to building 6 since heights[3] < heights[6] and heights[5] < heights[6].
In the third query, Alice cannot meet Bob since Bob cannot move to any other building.
In the fourth query, Alice and Bob can move to building 4 since heights[3] < heights[4] and heights[0] < heights[4].
In the fifth query, Alice can directly move to Bob's building since heights[1] < heights[6].
For ans[i] != -1, It can be shown that ans[i] is the leftmost building where Alice and Bob can meet.
For ans[i] == -1, It can be shown that there is no building where Alice and Bob can meet.
 */

public class LeftmostBuildingQueries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int heights[] = {6,4,8,5,2,7};
//		int queries[][] = {{0,1},{0,3},{2,4},{3,4},{2,2}};
		
//		int heights[] = {1,2};
//		int queries[][] = {{0,0},{0,1},{1,0},{1,1}};
		int heights[] = {1,2,1,2,1,2};
		int queries[][] = {
			    {0,0},{0,1},{0,2},{0,3},{0,4},{0,5},
			    {1,0},{1,1},{1,2},{1,3},{1,4},{1,5},
			    {2,0},{2,1},{2,2},{2,3},{2,4},{2,5},
			    {3,0},{3,1},{3,2},{3,3},{3,4},{3,5},
			    {4,0},{4,1},{4,2},{4,3},{4,4},{4,5},
			    {5,0},{5,1},{5,2},{5,3},{5,4},{5,5}};
		
//		Output
//		[0,1,2,3,4,5,1,1,3,3,5,5,2,3,2,3,4,5,3,3,3,3,5,5,4,5,4,5,4,5,5,5,5,5,5,5]
//		Expected
//		[0,1,3,3,5,5,1,1,-1,-1,-1,-1,3,-1,2,3,5,5,3,-1,3,3,-1,-1,5,-1,5,-1,4,5,5,-1,5,-1,5,5]
		PrintArray pa = new PrintArray();
		LeftmostBuildingQueries lm = new LeftmostBuildingQueries();
		pa.printSimpleImtArray(lm.leftmostBuildingsQueries(heights,queries));
		
	}
	 public int[] leftmostBuildingsQueries(int[] heights, int[][] queries) {
	        int queriesLen = queries.length;
	        int heightsLen = heights.length;
	        int meetingArray [] = new int [queriesLen];
	        int index=0;
	        for(int i=0;i<queriesLen;i++){
	            if(queries[i][0]==queries[i][1]){
	                meetingArray[index]=queries[i][0];
	                index++;
	                continue;
	            }else{
	                int aBuildingHight = heights[queries[i][0]];
	                int bBuildingHight = heights[queries[i][1]];
	                int j = queries[i][0]>queries[i][1]?queries[i][0]:queries[i][1];
	                for(;j<heightsLen;j++){
	                    if(heights[j]>=aBuildingHight && heights[j]>=bBuildingHight){
	                        meetingArray[index]=j;
	                        index++;
	                        break;
	                    }
	                    if(j==heightsLen-1) {
	                        meetingArray[index]=-1;
	                        index++;
	                    }
	                }
	            }
	        }
	        return meetingArray;
	    }

}
