package _4graph;
import java.util.*;

public class _29dijkastraAlgorithm_using_priorityQueue {
    
    // helper class to represent edges as target node and weight : 
    public static class Pair{
        int node;
        int weight;
        Pair(int node, int weight){
            this.node = node;
            this.weight = weight;

        }
 
    }

    // dijkstra algorith to find the the shortest path from the source vertes : 
    public static int[] dijkstra(int v , ArrayList<ArrayList<Pair>> adjList , int src){

        // array to store the shortest distance from the source to each vertes : 
        int distace[] = new int[v];

        // initialize the all distance to infinity : 
        for(int i = 0; i<v; i++){
            distace[i] = (int)(1e9);
        }

        // distance to soure vertes is 0 : 
        distace[src] = 0;

        // priority queue(min heap) to fetch the vertex with the smallest distance :
        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.weight));

        // start with the source vertex : 
        // src is the starting node : 
        pq.add(new Pair(src , 0));

        // process the priority queue untill all reacheable vertex are processed : 
        while(!pq.isEmpty()){

            // get the vertices with the smallest distance : 
            Pair current = pq.remove(); // node and weight hold in the pair : 
            int node = current.node; // this is the current node : 
            int currentDist = current.weight; // this is the weight of the node : or distance : 

            // now traverse the adjacencynode of the current node : 
            // and calculate the minimum distance form the src node : 
            for(Pair neighbour : adjList.get(node)){

                int nextNode = neighbour.node;
                int edgeWeight = neighbour.weight;

                // calculate the new distance to the neighbour : 
                int newDist = currentDist + edgeWeight;

                // if the new distance is smaller update and add the to the priority queue : 
                if(newDist < distace[nextNode]){
                    distace[nextNode] = newDist; // update the shortest distance :
                    pq.add(new Pair(nextNode , newDist)); // add the priority queue : 
                }

            }

        }

        // return the array of shortest distance : 
        return distace;

    }

    public static void main(String[] args) {

        // number of vertices in the graph : 
        int v = 6;

        // adjacency list to represent the graph : 
        ArrayList<ArrayList<Pair>> adjList = new ArrayList<>();
        for(int i = 0; i<v; i++){
            adjList.add(new ArrayList<>());
        }

        // add eges to the graph (undirected); 
        adjList.get(0).add(new Pair(1 , 4));
        adjList.get(0).add(new Pair(2 , 4));
        adjList.get(1).add(new Pair(0 , 4));
        adjList.get(1).add(new Pair(2 , 2));
        adjList.get(2).add(new Pair(0 , 4));
        adjList.get(2).add(new Pair(1 , 2));
        adjList.get(2).add(new Pair(3 , 3));
        adjList.get(2).add(new Pair(4 , 1));
        adjList.get(2).add(new Pair(5 , 6));
        adjList.get(3).add(new Pair(2 , 3));
        adjList.get(3).add(new Pair(5 , 2));
        adjList.get(4).add(new Pair(2 , 1));
        adjList.get(4).add(new Pair(5, 3));
        adjList.get(5).add(new Pair(2 , 6));
        adjList.get(5).add(new Pair(3 , 2));
        adjList.get(5).add(new Pair(4 , 3));

        // source vertes starting node: 
        int src = 0;

        // find the shortest distane using disjkastra algroright : 
        int distance[] = dijkstra(v, adjList, src);

        for(int i = 0; i<v; i++){
            
            System.out.println("to node " + i + " -> " + distance[i]);
        }
        
        
    }
}
