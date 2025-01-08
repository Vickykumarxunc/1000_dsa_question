package _4graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _26alienDiscitionary {
     public static ArrayList<Integer> topoSort(int v , ArrayList<ArrayList<Integer>> adjList){
        
        // first create a indegree array : 
        int indegree[] = new int[v];
        
        for(int i = 0; i<v; i++){
            for(int adjacencyNode : adjList.get(i)){
                indegree[adjacencyNode]++;
            }
        }
        
        // create a queue : 
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i<v; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }
        
        // createa a topo list : 
        ArrayList<Integer> topo = new ArrayList<>();
        while(!q.isEmpty()){
            int node = q.peek();
            q.remove();
            
            topo.add(node);
            
            // now check the adjacency node : 
            for(int adjacencyNode : adjList.get(node)){
                
                indegree[adjacencyNode]--;
                
                if(indegree[adjacencyNode] == 0){
                    q.add(adjacencyNode);
                }
            }
        }
        return topo;
    }


    public static  String findOrder(String[] dict, int k) {
         
        int n = dict.length;
        
        // first create a adjacency list of the graph : 
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i<k; i++){
            adj.add(new ArrayList<>());
        }
        
        // mai har baar string ka pair luga uar jo character distincet hoga uske basis par graph create kar duga : 
        for(int i = 0; i<n - 1; i++){
            
            String s1 = dict[i];
            String s2 = dict[i + 1];
            
            int len = Math.min(s1.length() , s2.length());
            for(int ptr = 0; ptr < len; ptr++){
                
                if(s1.charAt(ptr) != s2.charAt(ptr)){
                    
                    adj.get(s1.charAt(ptr) - 'a').add(s2.charAt(ptr) - 'a');
                    break;
                }
            }
        }
        
        /// now create a ans of the alien disctionary : 
        ArrayList<Integer> topo = topoSort(k , adj);
        
        String ans = "";
        for(int it : topo){
            ans = ans + (char)(it + (int)('a'));
        }
        return ans;
        
   }
    public static void main(String[] args) {

        int n = 5;
        int k = 4;
        String dict[] = {"baa" , "abcd" , "abca" , "cab" , "cad"};
        String ans = findOrder(dict, k);
        System.out.println(ans);
        
    }
}
