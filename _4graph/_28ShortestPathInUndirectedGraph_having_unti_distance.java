package _4graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
 

public class _28ShortestPathInUndirectedGraph_having_unti_distance {

    public static int[] shortestPath(int edges[][] , int n , int m , int src){

        // create a adjacency List of size n for storing the undirect graph : 
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i<n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i<m; i++){
            adj.get(edges[i][0]).add(edges[i][1]); 
            adj.get(edges[i][1]).add(edges[i][0]); 
        }

        // a dist array of size n intitalized with a large number to indicate that 
        // initially with the very large number 
        int dist[] = new int[n];
        for(int i = 0; i<n; i++){
            dist[i] = (int)(1e9);
        }
        dist[src] = 0;

        // bfs implement tation : 
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
         while(!q.isEmpty()){

            int node = q.peek();
            q.remove();

            for(int adjacencyNode : adj.get(node)){

                if(dist[node] + 1 <  dist[adjacencyNode]){

                    dist[adjacencyNode] = 1 + dist[node];
                    q.add(adjacencyNode);
                }
            }
         }

         // update the shortest distance are stored int the resulatand array dist : 
         // unreachable node are mark as -1;

         for(int i = 0; i<n; i++){
            if(dist[i] == 1e9){
                dist[i] = -1;
            }
         }
         
         // return the ans : 
         return dist;
    }
    public static void main(String[] args) {

        int n = 9;
        int m = 10;

        int edges[][] = {
            {0 , 1},
            {0 , 3},
            {3 , 4},
            {4 , 5},
            {5 , 6},
            {1 , 2},
            {2 , 6},
            {6 , 7},
            {7 , 8},
            {6 , 8}
        };

        int ans[] = shortestPath(edges, n, m, 0);
        for(int i = 0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
        
    }
}
