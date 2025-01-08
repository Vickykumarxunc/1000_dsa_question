package _4graph;

import java.util.*;

public class _16graphIsBipatiteOrNot_usingBFS {
    public static boolean check(int start , int v , ArrayList<ArrayList<Integer>> adj , int color[]){

        Queue<Integer> q = new ArrayDeque<>();
        q.add(start);

        while(!q.isEmpty()){

            int node = q.remove();

            // mark the opposite color the adjacency node of the node : 
            for(int adjacency_node : adj.get(node)){

                // if the adjacency node it yet not colored 
                // yet will give the opposite color of the node : 
                if(color[adjacency_node] == -1){

                    color[adjacency_node] = 1 - color[node];
                    q.add(adjacency_node);

                }
                //  if the adjacency guy have the same color : 
                // some one did color it one some other path : 
                else if(color[adjacency_node] == color[node]){
                    return  false;
                }
            }
        }
        return  true;
        
    }
    public static boolean isBipartite(ArrayList<ArrayList<Integer>> adjList , int v){

        // first create a color array : 
        int color[] = new int[v];

        // intitialize the color array by -1;
        for(int i = 0; i<v; i++){
            color[i] = -1;
        }

        // traverse the adjancency list : 
        for(int i = 0; i<v; i++){

            if(color[i] == -1){

                // call the bfs : 
                if(check(i , v , adjList , color) == false){
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


        boolean ans = isBipartite(adjList, v);
        System.out.println("graph is biprate or not = " + ans);
        
    }
}
