package _4graph;
import java.util.*;

public class _11DectectCycleUsingDfs {

    public static boolean dfs(int node , int parent , boolean visited[] , ArrayList<ArrayList<Integer>> adjList){

        // mark the current node : 
        visited[node] = true;
        for(int adjacentNode : adjList.get(node)){

            if(visited[adjacentNode] == false){

                if(dfs(adjacentNode , node , visited , adjList) == true){
                    return true;
                }
            }
            else if(adjacentNode != parent){
                return true;
            }
        }
        return false;

    }

    public static boolean isCycle(int v , ArrayList<ArrayList<Integer>> adjList){

        // create a visited array : 
        boolean visited[] = new boolean[v];
        for(int i = 0; i<v; i++){
            if(visited[i] == false){

                // call the dfs 
                if(dfs(i , -1 , visited , adjList) == true){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        
        int v = 5;
        // adjacency matrix ;
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for(int i = 0; i<v; i++){
            adjList.add(new ArrayList<>());
        }

        // add edges for each node : 
        adjList.get(0).add(1);
        adjList.get(1).add(0);

        adjList.get(1).add(2);
        adjList.get(1).add(4);

        adjList.get(2).add(1);
        adjList.get(2).add(3);

        adjList.get(3).add(2);
        adjList.get(3).add(4);

        adjList.get(4).add(1);
        adjList.get(4).add(3);

        boolean ans = isCycle(v, adjList);
        System.out.println("cycle is present in the graph or not = " + ans);

    }
}
