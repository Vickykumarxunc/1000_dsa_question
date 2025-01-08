package _2easy;

import java.util.ArrayList;

public class _16graphRepresentatinUsinglist {

    public static void addEdges(ArrayList<ArrayList<Integer>> adj , int i , int j){

        // since the graph is undeirect : 
        adj.get(i).add(j);
        adj.get(j).add(i);
    }
    public static void display(ArrayList<ArrayList<Integer>> adj){

        for(int i = 0; i<adj.size(); i++){

            System.out.print(i + " = ");
            for(int j : adj.get(i)){

                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0; i<=V; i++){
            adj.add(new ArrayList<>());
        }

        addEdges(adj , 1 , 2);
        addEdges(adj , 1 , 3);
        addEdges(adj , 2 , 4);
        addEdges(adj , 3 , 4);
        addEdges(adj , 2 , 5);
        addEdges(adj , 4 , 5);

        display(adj);

        
    }
}
