package _2easy;

import java.util.ArrayList;

public class _15dfsOfGraph {
    public static void dfs(int node , boolean visited[] , ArrayList<ArrayList<Integer>> adj , ArrayList<Integer> list){

        // make the current node is visited : 
        visited[node] = true;
        list.add(node);

        // get the neighbour node : 
        for(int element : adj.get(node)){

            if(visited[element] == false){

                // recursion for each unvisited node : 
                dfs(element , visited , adj , list);
            }
        }
    }
    public static ArrayList<Integer> dfs_of_graph(ArrayList<ArrayList<Integer>> adj , int V){

        // create a ans array list : 
        ArrayList<Integer> list = new ArrayList<>();

        // createa a visited array : 
        boolean visited[] = new boolean[V];
        visited[0] = true;

        // take the zero as a first element : 
        // this is the recursion function : 
        dfs(0 , visited , adj , list);
        return list;
    }
    public static void addEdges(ArrayList<ArrayList<Integer>> adj , int i , int j){

        adj.get(i).add(j);
        adj.get(j).add(i);

    }
    public static void main(String[] args) {
        
        // number of vertices in the graph : 
        int V = 5;

        // create a adjacency list : 
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i<=V; i++){
            adj.add(new ArrayList<Integer>());
        }

        // define the edges of the graph :
        addEdges(adj , 1 , 2);
        addEdges(adj , 1 , 0);
        addEdges(adj , 2 , 0);
        addEdges(adj , 2 , 3);
        addEdges(adj , 2 , 4);

        ArrayList<Integer> dfs = dfs_of_graph(adj, V);
        System.out.println(dfs);

    }
}
