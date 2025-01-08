package _4graph;

import java.util.ArrayList;

public class _17bipartiteUsing_dfs {
    public static boolean dfs(int node , int col , int color[] , ArrayList<ArrayList<Integer>> adj){

        color[node] = col;
        for(int adjacency_node : adj.get(node)){

            if(color[adjacency_node] == -1){

                if(dfs(adjacency_node , 1 - col , color , adj) == false){
                    return false;
                }
            }
            else if(color[adjacency_node] == col){
                return false;
            }
        }
        return true;
    }
    public static boolean isBipartite(int v , ArrayList<ArrayList<Integer>> adj){

        int color[] = new int[v];
        for(int i = 0; i<v; i++){
            color[i] = -1;
        }

        for(int i = 0; i<v; i++){

            if(color[i] == -1){

                if(dfs(i , 0 , color , adj) == false){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
        int v = 4;
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for(int i = 0; i<v; i++){
            adjList.add(new ArrayList<>());
        }

        // adding edges (undiredct graph )
        adjList.get(0).add(1);
        adjList.get(0).add(3);
        adjList.get(1).add(0);
        adjList.get(1).add(2);
        adjList.get(2).add(1);
        adjList.get(2).add(3);
        adjList.get(3).add(0);
        adjList.get(3).add(2);


        boolean ans = isBipartite(v , adjList);
        System.out.println("graph is biprate or not = " + ans);
    }
}
