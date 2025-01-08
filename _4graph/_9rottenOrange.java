package _4graph;

import java.util.ArrayDeque;
import java.util.*;

public class _9rottenOrange {
    public static class Pair{
        int row;
        int col;
        int time;
        Pair(int row , int col , int time){
            this.row = row;
            this.col = col;
            this.time = time;
        }

    }
    public static int oragesRotting(int mat[][]){

        int n = mat.length;
        int m = mat[0].length;

        // create a visited array : 
        int visited[][] = new int[n][m];

        // create a queue which contain the rotten orange and time : 
        Queue<Pair> q = new ArrayDeque<>();
        
        // count the fresh oranges : 
        int count_fresh = 0;

         for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){

                // if found rotten oragnes add into the queue with zero time : 
                // and mark into the visited array and rotten : 
                if(mat[i][j] == 2){
                    q.add(new Pair(i , j , 0));
                    visited[i][j] = 2;
                }
                else{
                    visited[i][j] = 0;
                }
                // if we get the fresh orange : 
                if(mat[i][j] == 1){
                    count_fresh++;
                }
            }
         }

         int tm = 0;
         int delRow[] = {-1 , 0 , +1 , 0};
         int delCol[] = {0 , 1 , 0 , -1};
         int count = 0;

         // now traverse the queue : 
         while(!q.isEmpty()){

            int r = q.peek().first; // row 
            int c = q.peek().second; // col 
            int t = q.peek().time; // time
            tm = Math.max(tm , t);
            q.remove();

            for(int i = 0; i<4; i++){
                int nrow = r + delRow[i];
                int ncol = c + delCol[i];

                if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && 
                visited[nrow][nc])

            }
         }
    }
    public static void main(String[] args) {
        
    }
}
