package _4graph;
import  java.util.ArrayList;

public class _4dfs {

    public static void dfs_traversal(int node , boolean visited[] , ArrayList<ArrayList<Integer>> adjList , ArrayList<Integer> ans){

        // mark the current element : 
        visited[node] = true;
        
        // add into the ans list : 
        ans.add(node);

        // getting the unvisited neighbour node : 
        for(int element : adjList.get(node)){

            if(visited[element] == false){

                // call the recursion : 
                dfs_traversal(element ,  visited, adjList, ans);
            }
        }

    }
    public static ArrayList<Integer> dfs( int v , ArrayList<ArrayList<Integer>> adjList){

        // create a visited array : 
        boolean visited[] = new boolean[v + 1];
        visited[0] = true;
        
        // create a ans arrayList which store the dfs travesal : 
        ArrayList<Integer> ans = new ArrayList<>();

        // recursion call : 
        dfs_traversal(0 , visited , adjList , ans);

        // return the ans list : 
        return ans;
    }

     public static void addEdges(ArrayList<ArrayList<Integer>> adjList , int i , int j){

        adjList.get(i).add(j);
        adjList.get(j).add(i);
     }
    public static void main(String[] args) {
        
        int v = 5;
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        for(int i = 0; i<=v; i++){
            adjList.add(new ArrayList<>());
        }

        // add the dges to the graph : 
        addEdges(adjList , 0 , 1);
        addEdges(adjList , 0 , 2);
        addEdges(adjList , 1 , 3);
        addEdges(adjList , 1 , 4);
        addEdges(adjList , 2 , 4);

        ArrayList<Integer> ans = dfs(v, adjList);
        System.out.println(ans);


    }
}

/*
 * space complexity = O(n) 
 * time complexity = O(v + e)
 */
