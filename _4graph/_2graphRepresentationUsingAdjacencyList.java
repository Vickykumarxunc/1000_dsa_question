package _4graph;
import java.util.ArrayList;

public class _2graphRepresentationUsingAdjacencyList {

    public static void addEdges(ArrayList<ArrayList<Integer>> adjList , int i , int j){

        adjList.get(i).add(j);
        adjList.get(j).add(i);

    }

    public static void display(ArrayList<ArrayList<Integer>> adjList){

        for(int i = 0; i<adjList.size(); i++){

            for(int element : adjList.get(i)){

                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        // create a graph with 5 vertices  : 
        int v = 5;
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        // add the n + 1 arraylist in the adj arraylist : 
        for(int i = 0; i<=v; i++){
            adjList.add(new ArrayList<>());
        }

        // now add the edges one by one : 
         addEdges(adjList , 1 , 2);
         addEdges(adjList , 1 , 3);
         addEdges(adjList , 2 , 4);
         addEdges(adjList , 3 , 4);
         addEdges(adjList , 2 , 5);
         addEdges(adjList , 4 , 5);

         display(adjList);



    }
}

/*
 * space usesd = : o(2E) 
 */
