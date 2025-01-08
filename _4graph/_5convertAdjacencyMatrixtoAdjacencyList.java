package _4graph;

import java.util.ArrayList;

public class _5convertAdjacencyMatrixtoAdjacencyList {
    public static void main(String[] args) {
        
        int adjMatrix[][] = {
            {0 , 1 , 1 , 0},
            {1 , 0 , 0 , 1},
            {1 , 0 , 0 , 1},
            {0 , 1 , 1 , 0}
        };
        // create a adjacency list :
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        int n = adjMatrix.length;

        // initialize the adjacency list : 
        for(int i = 0; i<n; i++){
            adjList.add(new ArrayList<>());
        }

        //populate the adjacency list : 
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){

                if(adjMatrix[i][j] == 0){
                    adjList.get(i).add(j);
                }
            }
        }

        for(int i = 0; i<adjList.size(); i++){
            System.out.println("vetex " + i + " : " + adjList.get(i));
        }
    }
}
