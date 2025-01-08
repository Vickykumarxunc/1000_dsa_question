package _2easy;

public class _16graphRepsentationUsingAdjmatrix {
    public static void addEdges(int adj[][] , int i , int j){

        // since the graph is undirected : 
        // give edges par ek fill kar do  : 
        // other edges par 0 fill kar do : 
        adj[i][j] = 1;
        adj[j][i] = 1;
    }
    public static void display_graph(int adj[][]){

         for(int i = 0; i<adj.length; i++){

            for(int j = 0; j<adj.length; j++){

                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
         }
    }
    public static void main(String[] args) {
        
        // no of edges : 
        int V = 5;
        int adj[][] = new int[V + 1][V + 1];

        // now add edgest
        addEdges(adj , 1 , 2);
        addEdges(adj , 1 , 3);
        addEdges(adj , 2 , 4);
        addEdges(adj , 3 , 4);
        addEdges(adj , 3 , 5);
        addEdges(adj , 4 , 5);

        display_graph(adj);

    }
}
