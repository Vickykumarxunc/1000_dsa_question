package _2easy;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class _14bfsOfGraph {
    public static ArrayList<Integer> bfs(int v , ArrayList<ArrayList<Integer>> adjList){

        // create a arraylist to store the bfs traversal : 
        ArrayList<Integer> bfs = new ArrayList<>();

        // creaete a visited array : 
        boolean visited[] = new boolean[v];

        // create queue which store the unvisited node: 
        Queue<Integer> q = new ArrayDeque<>();
        q.add(0);
        visited[0] = true;

        while(!q.isEmpty()){

            int node = q.remove();

            bfs.add(node);
            for(int elemenet : adjList.get(node)){

                if(visited[elemenet] == false){

                    q.add(elemenet);
                    visited[elemenet] = true;
                }
            }
        }
        return bfs;

    }
    public static void addEdges(ArrayList<ArrayList<Integer>> adjList , int i , int j){

        adjList.get(i).add(j);
        adjList.get(j).add(i);
    }

    public static void display(ArrayList<ArrayList<Integer>> adjList){

        for(int i = 0; i<adjList.size(); i++){

            for(int element : adjList.get(i)){

                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        // number of vertices in the graph :
        int v = 5;

        // adjacency list represent the graph : 
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // add the v + 1 adjacency list in the adjlist : 
        for(int i = 0; i<=v; i++){
            adj.add(new ArrayList<>());
        }

        // add the edges to the list : 
        addEdges(adj , 1 , 2);
        addEdges(adj , 1 , 0);
        addEdges(adj , 2 , 0);
        addEdges(adj , 2 , 3);
        addEdges(adj , 2 , 4);

        ArrayList<Integer> ans = bfs(v, adj);
        System.out.println(ans);
        

    }
}
