package _4graph;

import java.util.ArrayList;

public class _22eventualSafeState_usingDFS {

    public static boolean dfs(int node , int visited[] , int path_visited[] , int check[] , ArrayList<ArrayList<Integer>> adj){

        visited[node] = 1;
        path_visited[node] = 1;
        check[node] = 0;

        for(int adjacency_node : adj.get(node)){

            if(visited[adjacency_node] == 0){

                if(dfs(adjacency_node, visited, path_visited, check, adj) == true){
                    return true;
                }
            }
            else if(path_visited[adjacency_node] == 1){
                return true;
            }
        }
        check[node] = 1;
        path_visited[node] = 0;
        return  false;
    }

     public static ArrayList<Integer> safeNode(int v , ArrayList<ArrayList<Integer>> adj){

        int visited[] = new int[v];
        int path_visited[] = new int[v];

        int check[] = new int[v];

        for(int i = 0; i<v; i++){

            if(visited[i] == 0){

                dfs(i , visited , path_visited , check , adj);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<v; i++){

            if(check[i] == 1){
                list.add(i);
            }
        }
        return list;
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
        
        ArrayList<Integer> ans = safeNode(v, adjList);
        System.out.println(ans);
    }
}
