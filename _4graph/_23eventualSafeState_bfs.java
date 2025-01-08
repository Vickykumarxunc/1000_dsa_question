package _4graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class _23eventualSafeState_bfs {

    public static ArrayList<Integer> eventualSafeState(int v , ArrayList<ArrayList<Integer>> adj){

        // first reverse the all edges : 
        ArrayList<ArrayList<Integer>> adjRev = new ArrayList<>();
        for(int i = 0; i<v; i++){
            adjRev.add(new ArrayList<>());
        }
        
        // create a indegree array : 
        int indegree[] = new int[v];
        for(int i = 0; i<v; i++){

            // i-> it
            // it -> i
            for(int it : adj.get(i)){
                adjRev.get(it).add(i);
                indegree[i]++;
            }
        }

        // now create a queue : 
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> safeNode = new ArrayList<>();

        // phle queue me ve node add karo jiski indegree 1 hai : 
        for(int i = 0; i<v; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }

        // now traverse the queue : 
        while(!q.isEmpty()){

            // pick the top most element from the queue : 
            int node = q.peek();
            q.remove();

            // add the node into ans (safenode) array list : 
            safeNode.add(node);

            // now traverse the adjacency node : 
            for(int adjacencyNode : adjRev.get(node)){

                // first decreaes the indegree of adjacency node : 
                indegree[adjacencyNode]--;

                // check the indegree of adjacency node : 
                if(indegree[adjacencyNode] == 0){
                    q.add(adjacencyNode);
                }
            }
        }

        // for return the ans in the sorted array we sor the array list : 
        Collections.sort(safeNode);
        return safeNode;
    }
    public static void main(String[] args) {

        int v = 6;
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        for(int i = 0; i<v; i++){
            adjList.add(new ArrayList<>());
        }
        adjList.get(5).add(0);
        adjList.get(5).add(2);
        adjList.get(4).add(0);
        adjList.get(2).add(3);
        adjList.get(3).add(1);
        adjList.get(4).add(1);
        
        ArrayList<Integer> ans = eventualSafeState(v, adjList);
        System.out.println(ans);
    }
}
