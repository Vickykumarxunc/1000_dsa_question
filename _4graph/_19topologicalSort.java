package _4graph;

//** using the dfs ..  */
import java.util.ArrayList;
import java.util.Stack;

public class _19topologicalSort {
    public static void dfs(int node , int visited[] , Stack<Integer> st , ArrayList<ArrayList<Integer>> adj){

        visited[node] = 1;
        for(int adjacency_Node : adj.get(node)){
            if(visited[adjacency_Node] == 0){

                dfs(adjacency_Node, visited, st, adj);
            }
        }
        st.push(node);
    }
    public static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> adj){

        int v = adj.size();

        // create a visited array : 
        int visited[] = new int[v];

        // create a stack : 
        Stack<Integer> st  = new Stack<>();

        // traverse the list : 
        for(int i = 0; i<v; i++){

            if(visited[i] == 0){

                // call dfs  : 
                dfs(i , visited , st , adj);
            }
        }

        // create a ans : 
        ArrayList<Integer> list = new ArrayList<>();
        while(!st.isEmpty()){
            list.add(st.pop());
        }
        return list;
    }
    public static void main(String[] args) {
        
        int vertices = 6;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        // Add edges (example graph)
        graph.get(5).add(2);
        graph.get(5).add(0);
        graph.get(4).add(0);
        graph.get(4).add(1);
        graph.get(2).add(3);
        graph.get(3).add(1);

        ArrayList<Integer> list = topologicalSort(graph);
        System.out.println(list);
    }
}
