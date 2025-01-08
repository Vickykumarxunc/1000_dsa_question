package _4graph;

import java.util.ArrayList;

public class _6numberOfProviences {

    public static void dfs(int node , ArrayList<ArrayList<Integer>> adjList , boolean visited[]){

        // mark the true visited array : 
        visited[node] = true;

        // now traverse the unvisited node : 
        for(int element : adjList.get(node)){

            // call the dfs : 
            if(visited[element] == false){
                dfs(element, adjList, visited);
            }
        }
    }
     public static int numProviences(ArrayList<ArrayList<Integer>> adj , int v){

        // create a visited array : 
        boolean visited[] = new boolean[v];
        int count = 0;

        // traverse the all node : 
        for(int i = 0; i<v; i++){

            if(visited[i] == false){
                
                count++;
                // call the dfs :to traverse the current proviences : 
                dfs(i , adj , visited);
            }
        }

        // return the count : 
        return count;
     }
    public static void main(String[] args) {
        
        int v = 2;

        // adjacency matrix :
        int adjMatrix[][] = {
            {1 , 0},
            {0 , 1}
        };

        // covnert the adjancency matrix into the adjacency list : 
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        // initialize the adjacency list : 
        for(int i = 0; i<v; i++){
            adjList.add(new ArrayList<>());
        }
        for(int i = 0; i<v; i++){
            for(int j = 0; j<v; j++){

                if(adjMatrix[i][j] == 1){
                    adjList.get(i).add(j);
                }
            }
        }

        int count = numProviences(adjList, v);
        System.out.println("number of proviences = " + count);
    }
}
