package _4graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _21cycleInDirectedGraph_usingBFS {

    public static boolean isCycle(int v , ArrayList<ArrayList<Integer>> adj){

        // create a indegree array : 
        int indegree[] = new int[v];
        for(int i = 0; i<v; i++){
            for(int adjacency_Node  : adj.get(i)){
                indegree[adjacency_Node]++;
            }
        }

        // create a queue : 
        Queue<Integer> q = new LinkedList<>();
        
        // first add those node have 0 indegee : 
        for(int i = 0; i<v; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }

        int count = 0;
        while(!q.isEmpty()){

            int node = q.remove();
            count++;

            for(int adjacency_node : adj.get(node)){

                indegree[adjacency_node]--;
                if(indegree[adjacency_node] == 0){
                    q.add(adjacency_node);
                }
            }
        }

        if(count == v){
            return false;
        }
        return true;
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
        System.out.println("cycle present in the graph or not = " + ans);
    }
}
