package _4graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _24prerequistTask {
    public static boolean isPossible(int N , int P , int prerequisites[][]){

        // first create a graph : 
          // use the topo sort :
        
        // first convert the all pair in the graph : 
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for(int i = 0; i<N; i++){
            adjList.add(new ArrayList<>());
            
        }
        int m = prerequisites.length;
        for(int i = 0; i<m; i++){
            adjList.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        
        // now apply the topological sort : 
        int indegree[] = new int[N];
        for(int i = 0; i<N; i++){
            for(int adjacencyNode : adjList.get(i)){
                indegree[adjacencyNode]++;
            }
        }
        
        // create a queue : 
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i<N; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }
        
        // now traverse the queue : 
        ArrayList<Integer> topo = new ArrayList<>();
        while(!q.isEmpty()){
            
            int node = q.remove();
            topo.add(node);
            
            // traverse the adjacency node : 
            for(int adjacencyNode : adjList.get(node)){
                
                indegree[adjacencyNode]--;
                
                if(indegree[adjacencyNode] == 0){
                    q.add(adjacencyNode);
                }
            }
        }
        
        if(topo.size() == N){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        
        int n = 4;
        int p = 3;
        int prerequisites[][] = {
            {1 , 0},
            {2 , 1},
            {3 , 2}
        };

        boolean ans = isPossible(n, p, prerequisites);
        System.out.println(ans);
    }
}
