package graph;

import java.util.ArrayList;

public class DepthFirstSearch {
    private ArrayList<Integer> dfs = new ArrayList<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public ArrayList<Integer> dfsOfGraph(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        
        boolean visited[] = new boolean [adj.size()];
        int len = adj.size();
        for(int i =0;i<len;i++){
            if(visited[i] ==false){
                recDfs(adj,i,visited);
            }
        }
        return dfs;
        
    }
    
    private void recDfs(ArrayList<ArrayList<Integer>> adj, int i, boolean[] visited) {
        visited[i] = true;    
        dfs.add(i);
        for(int j = 0; j < adj.get(i).size(); j++) {
            if(!visited[adj.get(i).get(j)]) {
                recDfs(adj, adj.get(i).get(j), visited);
            }
        }
    }

}
