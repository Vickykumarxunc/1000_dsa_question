package _4graph;

import java.util.ArrayList;
import java.util.Stack;

public class _27shortestDistanceInAcyclicDirectedGraph {
    public static class Pair{
        int first;
        int second;
        Pair(int first , int second){
            this.first = first;
            this.second = second;
        }
    }

    public static void topoSort(int node , ArrayList<ArrayList<Pair>> adjList , int visited[] , Stack<Integer> st){

        visited[node] = 1;
        for(int i = 0; i<adjList.get(node).size(); i++){

            int v = adjList.get(node).get(i).first;
            if(visited[v] == 0){

                topoSort(v, adjList, visited, st);
            }
        }
        st.add(node);
    }

    public static int[] shortestPath(int N , int M , int edges[][]){

        // first declare the adjacency list of the pair : 
        ArrayList<ArrayList<Pair>> adjList = new ArrayList<>();
        for(int i = 0; i<N; i++){

            ArrayList<Pair> temp = new ArrayList<>();
            adjList.add(temp);
        }

        // we create a graph in the form of an adjacency list : 
        for(int i = 0; i<M; i++){

            int u = edges[i][0];
            int v = edges[i][1];
            int wt = edges[i][2];
            adjList.get(u).add(new Pair(v , wt));
        }

        // step 1 apply the topo sort algorithm : 
        int visited[] = new int[N];

        // now we perform the topo sort using the dfs technique : 
        // and store the result in the stack st : 
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<N; i++){

            if(visited[i] == 0){

                topoSort(i , adjList , visited , st);
            }
        }

        // step ab mai stack me se ek ek element ko remvoe karuga . and relax the edges :
        
        // further we declare a vector "dist" in which we update the value of the noe 
        // distance from the source vertex after relaxation of the particular node : 
        int distance[] = new int[N];
        for(int i = 0; i<N; i++){

            // initialize the distace array by the infinity : 
            distance[i] = (int)(1e9);
        }

        distance[0] = 0;

        // pick the element from the stack one by one while stack is not empty : 
        while(!st.isEmpty()){

            int node = st.peek();
            st.pop();

            // now go the adjacencyn node of the particular node and update the disntace : in the distance array : 
             for(int i = 0; i<adjList.get(node).size(); i++){

                int v = adjList.get(node).get(i).first; // this is the adjacency node : 
                int wt = adjList.get(node).get(i).second; // this is the weight of the adjacency node edges : 

                if(distance[node] + wt < distance[v]){
                    distance[v] = wt + distance[node];
                }
             }
        }

        // if the minum infinity distance is not update then it update by the -1 . 
        for(int i = 0; i<N; i++){
            if(distance[i] == 1e9){
                distance[i] = -1;
            }
        }
        return distance;
    }
    public static void main(String[] args) {
        
        int n = 6;
        int m = 7;
        int edges[][] = {
            {0 , 1 , 2},
            {0 , 4 , 1},
            {4 , 5 , 4},
            {4 , 2 , 2},
            {1 , 2 , 3},
            {2 , 3 , 6},
            {5 , 3 , 1}
        };

        int result[] = shortestPath(n, m, edges);
        for(int i = 0 ; i<result.length; i++){
            System.out.print(result[i] + " ");
        }

    }
    
}
