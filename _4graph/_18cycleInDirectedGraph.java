package _4graph;

import java.util.*;

public class _18cycleInDirectedGraph {

    public static boolean dfs(int node , ArrayList<ArrayList<Integer>> adj , int visited[] , int path_visited[]){

        visited[node] = 1;
        path_visited[node] = 1;

        // traverse the adjanency list : 
        for(int adjacencyNode : adj.get(node)){

            // when the node is not visited : 
            if(visited[adjacencyNode] == 0){

                if(dfs(adjacencyNode , adj , visited , path_visited) == true) { 
                    return true;
                }
            }

            // if the node has been previously visited : 
            // bu it has been visited to on the same path : 
            else if(path_visited[adjacencyNode] == 1){
                return true;
            }
        }

        // remaor : 
        path_visited[node]  = 0;
        return false;
    }
    public static boolean isCycle(int v , ArrayList<ArrayList<Integer>> adj){

        // create a visited array : 
        int visited[] = new int[v];

        // create a visited path array : 
        int path_visited[] = new int[v];

        // traverse the adjacency list : 
        for(int i = 0; i<v; i++){

            if(visited[i]== 0){

                if(dfs(i , adj , visited , path_visited) == true){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        
        int V = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Adding edges to the graph
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(2);
        adj.get(2).add(0);
        adj.get(2).add(3);
        adj.get(3).add(3);

        boolean ans = isCycle(V, adj);
        System.out.println("cycle is present in the graph or not : " + ans);
    }
}
