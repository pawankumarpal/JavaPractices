package graph;

import java.util.ArrayList;

public class CourseSchedule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] prerequisites = {{0,1},{0,2},{1,2}};
		int numCourses = 3;
		
//		int [][] prerequisites = {{1,0}};
//		int numCourses = 2;
//		
		
//		int [][] prerequisites = {{1,4},{2,4},{3,1},{3,2}};
//		int numCourses = 5;
		System.out.println(canFinish(numCourses, prerequisites));
	}
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
    	
        int len =prerequisites.length;
        boolean a = true;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(numCourses);
        //ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i=0;i<numCourses;i++) {
        	adj.add(new ArrayList<Integer>());
        }
        for(int i=0;i<len;i++) {
        	adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        boolean visited[] = new boolean[numCourses];
        System.out.println(adj);
        for(int k=0;k<adj.size();k++) {
        	if(!adj.get(k).isEmpty()) {
        	boolean b = dfs(adj, visited, k);
        	if(b==false) return b;
        	visited = new boolean[numCourses];
        	}
        }

        return true;
    }
    
    public static boolean dfs(ArrayList<ArrayList<Integer>> adj ,boolean visited[], int k) {
    	if(visited[k]==true) return false;
    	if(!adj.get(k).isEmpty()) {
    		visited[k]= true;
    		for(int x=0;x<adj.get(k).size();x++) {
    			dfs(adj, visited, adj.get(k).get(x));
    		}
    	}
    	return true;
    }
	
	

}
