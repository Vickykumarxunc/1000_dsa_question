package _4graph;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
 

public class _3bfs {
    public static ArrayList<Integer> bfs(int v , ArrayList<ArrayList<Integer>> adjList){

        // create a ans array List which store the bfs traversal : 
       ArrayList<Integer> ans = new ArrayList<>();

       // create a visited array  : 
       boolean visited[] = new boolean[v];

       // create a queue 
       Queue<Integer> q = new ArrayDeque<>();
       // starting node of graph is 0 
       q.add(0);
       visited[0] = true;

       while(!q.isEmpty()){
        
        // remove the top element of the queue : 
        int node = q.remove();

        // add the element in the and array List : 
        ans.add(node);

        // now add the unvisited neighbour of node in the queue : 
        for(int element : adjList.get(node)){

            if(visited[element] == false){

                q.add(element);
                visited[element] = true;
            }
        }

       }
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

        addEdges(adjList , 0 , 1);
        addEdges(adjList , 0 , 2);
        addEdges(adjList , 1 , 3);
        addEdges(adjList , 1 , 4);
        addEdges(adjList , 2 , 4);

        ArrayList<Integer> bfs = bfs(v, adjList);
        System.out.println(bfs);
        
    }
    
}
