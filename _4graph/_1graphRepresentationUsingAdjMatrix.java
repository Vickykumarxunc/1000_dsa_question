package _4graph;

public class _1graphRepresentationUsingAdjMatrix {

    // create a  adjacency matrix : of 0 and 1 : 
    public static void addEdges(int adjMat[][] , int i , int j){

        // since the graph is undirected : 
        // given edges par 1 fill kar do : 
        adjMat[i][j] = 1;
        adjMat[j][i] = 1;
    }

    // display the adjacency matrix : 
    public static void display(int adjMat[][]){

        int n = adjMat.length;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print(adjMat[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        // create a graph with 5 vertices and no edges : 
        // note that all value are initialize as 0 : 
        int v = 5;
        int adjMat[][] = new int[v + 1][v + 1];

        // now add edges one by one : 
        addEdges(adjMat , 1 , 2);
        addEdges(adjMat , 1 , 3);
        addEdges(adjMat , 2 , 4);
        addEdges(adjMat , 3 , 4);
        addEdges(adjMat , 3 , 5);
        addEdges(adjMat , 4 , 5);

        display(adjMat);
    }

    /* 
     * space uses = (n * n)
     */
}
