package _4graph;

import java.util.ArrayDeque;
import java.util.Queue;

public class _7noOfIsland {
    public static class Pair{
        int first;
        int second;
        Pair(int first , int second){
            this.first = first;
            this.second = second;
        }
    }

    public static void bfs(int ro , int co , int visited[][] , char grid[][])
    {
        // mark the current node : 
        visited[ro][co] = 1;

        // create a queue of pair : 
        Queue<Pair> q = new ArrayDeque<>();
        q.add(new Pair(ro , co));

        int n = grid.length;
        int m = grid[0].length;

        // now traverse the queue while queue is not empty : 
        while(!q.isEmpty()){

            int row = q.peek().first;
            int col = q.peek().second;
            q.remove();

            // traverse the neighbour and mark the it is a land :
             for(int delrow = -1; delrow <= 1; delrow++){
                for(int delcol = -1; delcol <= 1;  delcol++){

                    int nrow = row + delrow;
                    int ncol = col + delcol;

                    // this is the valid condition for the island : 
                    if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m
                      && grid[nrow][ncol] == '1' && visited[nrow][ncol] == 0){

                        visited[nrow][ncol] = 1;
                        q.add(new Pair(nrow , ncol));
                      }
                }
             }

        }
    }

    public static int countIsland(char grid[][])
    {

        int n = grid.length;
        int m = grid[0].length;

        // create a visited aray ; 
        int visited[][] = new int[n][m];

        // maintain the count variable : 
        int count = 0;
        
        // now traverse the given grid : 
        for(int row = 0; row < n; row++){
            for(int col = 0; col < m; col++){

                if(visited[row][col] == 0 && grid[row][col] == '1'){
                    count++;
                    // call the bfs : 
                    bfs(row , col , visited , grid);
                }
            }
        }

        return count;
    }
    public static void main(String[] args) {
    
        char grid[][] = {
            {'0' , '1'},
            {'1' , '0'},
            {'1' , '1'},
            {'1' , '0'}
        };

        int count = countIsland(grid);
        System.out.println("no of island is = " + count);

    }
}
