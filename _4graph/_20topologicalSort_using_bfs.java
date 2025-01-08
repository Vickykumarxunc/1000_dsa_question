package _4graph;
import java.util.*;
//* using the bfs .................... */
public class _20topologicalSort_using_bfs {

    public static ArrayList<Integer> topologicalSort(int v , ArrayList<ArrayList<Integer>> adj){

        // creaete a indegree array : 
        int indegree[] = new int[v];

        //? how to find the indegree of node : 
        // traverse the adjacency list : 
        for(int i = 0; i<v; i++){
            for(int adjacency_node : adj.get(i)){
                indegree[adjacency_node]++;
            }
        }

        // create a queue : 
        Queue<Integer> q = new LinkedList<>();
        
        // phle queue me ve node add kar do jiski degree 0 hai : 
        for(int i = 0; i<v; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }

        // create a ans array List : 
        ArrayList<Integer> ans = new ArrayList<>();

        // travese the queue : 
        // mai queue me ek ek element pick karuga ; 
        // uar uske adjacency node ki degree ko ek ek se decrease kar duga : 
        while(!q.isEmpty()){
            
            int node = q.remove();

            // first add into the list  : 
            ans.add(node);

            // decrease the degree : 
            for(int adjacency_Node : adj.get(node)){
                indegree[adjacency_Node]--;

                if(indegree[adjacency_Node] == 0){
                    q.add(adjacency_Node);
                }
            }
        }

        return ans;
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

        ArrayList<Integer> ans = topologicalSort(vertices, graph);
        System.out.println(ans);
    }
}
