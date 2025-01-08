package _4graph;
import java.util.*;

public class _25courseScheduled {
    public static int[] findOrder(int n , int m , ArrayList<ArrayList<Integer>> prerequisites){

        // form a graph : 
        ArrayList<ArrayList<Integer>> adjList  = new ArrayList<>();
        for(int i = 0; i<n; i++){
            adjList.add(new ArrayList<>());
        }

        // reverse the graph : 
        for(int i = 0; i<m; i++){
            adjList.get(prerequisites.get(i).get(1)).add(prerequisites.get(i).get(0));
        }

        // create a indegree edges : 
        int indegree[] = new int[n];
        for(int i = 0; i<n; i++){
            for(int adjacencyNode : adjList.get(i)){
                indegree[adjacencyNode]++;
            }
        }

        // create a queue : 
        Queue<Integer> q = new LinkedList<>();

        // add the node in the queue whose indegree is 0 : 
        for(int i = 0; i<n; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }

        // traverse the queue : 
        // and create a topo array : 
        int topo[] = new int[n];
        int index = 0;

        while(!q.isEmpty()){

            int node = q.remove();

            topo[index] = node;
            index++;

            // traverse the adjacency node : 
            for(int adjacencyNode : adjList.get(node)){

                indegree[adjacencyNode]--;

                if(indegree[adjacencyNode] == 0){
                    q.add(adjacencyNode);
                }
            }
        }

        if(index == n){
            return topo;
        }
        int arr[] = {};
        return arr;
    }
    public static void main(String[] args) {
        
        int n = 4;
        int m = 4;
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        
        for(int i = 0; i<n; i++){
            adjList.add(new ArrayList<>());
        }

        adjList.get(1).add(0);
        adjList.get(2).add(0);
        adjList.get(3).add(1);
        adjList.get(3).add(2);

        int ans[] = findOrder(n, m, adjList);
        for(int i = 0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
