package _4graph;

import java.util.*;
public class _10DetectACycleUsingBfs {
    public static class Pair{
        int first;
        int second;
        Pair(int first , int second){
            this.first = first;
            this.second = second;
        }
    }
    public static boolean checkForCycle(int src , int V , ArrayList<ArrayList<Integer>> adj , boolean visited[]){

        //current node true kar do usko hamne visite kar liye : 
        visited[src] = true;
        Queue<Pair> q = new ArrayDeque<>();
        q.add(new Pair(src , -1));

        // now traverse the queue : 
        while(!q.isEmpty()){

            int node = q.peek().first;
            int parent = q.peek().second;
            q.remove();

            for(int adjacentNode : adj.get(node)){

                if(visited[adjacentNode] == false){
                    visited[adjacentNode] = true;
                    q.add(new Pair(adjacentNode , node));
                }

                // agar current node detect hai aur uska previous node 
                // parent nahi hai to graph me cycle present hai : 
                else if(parent != adjacentNode){
                    return  true;
                }
            }
        }
        return false;
    }
    public static boolean isCycle(ArrayList<ArrayList<Integer>> adjList){

        // create a visited array ; 
        boolean visited[] = new boolean[adjList.size()];
        for(int i = 0; i<adjList.size(); i++){
            visited[i] = false;
        }
        // graph have multiple component : 
        for(int i = 0; i<adjList.size(); i++){
            if(visited[i] == false){

                if(checkForCycle(i , adjList.size() , adjList , visited)){
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

        boolean ans = isCycle(adjList);
        System.out.println("cycle is present in the graph or not = " + ans);

        /*
         * time complexity = O(N + 2E) + O(N)
         * space complexity = O(N) + O(N)
         */

        
    }
}
