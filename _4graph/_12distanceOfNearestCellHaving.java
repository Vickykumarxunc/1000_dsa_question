package _4graph;

import java.util.ArrayDeque;
import java.util.Queue;

public class _12distanceOfNearestCellHaving{

    // create a node class : 
    public static class Node{
        int first;
        int second;
        int third;

        Node(int first , int second , int third){
            this.first = first;
            this.second = second;
            this.third = third;
        }
    }


    public static int[][] nearest(int grid[][]){

        int n = grid.length;
        int m = grid[0].length;

        // first create a visited array : 
        int visited[][] = new int[n][m];

        // now cretate a ans array : 
        int ans[][] = new int[n][m];

        // createa a queue : 
        Queue<Node> q = new ArrayDeque<>();

        // sabse phle hame sare 1 ka coordinate ko queue me store karana hai zero(0) distance ke sath : 
        // aur visited array me 1 ka jo place hai usko mark bhi kar do : ki hamne ye element visit kar liya hai : 
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){

                if(grid[i][j] == 1){

                    q.add(new Node(i , j , 0));
                    visited[i][j] = 1;
                }
                else{
                    visited[i][j] = 0;
                }
            }
        }

        // mai sirf ek baar me 4 direction me hi traverse kar sakta hoon to finding the minimum distance : 
        int delRow[] = {-1 , 0 , +1 , 0};
        int delcol[] = {0 , +1 , 0 , -1};

        // ab mai queue par traverse karuga jab tak meri queue empty na ho jaye : 
        // mai har baar queue ka top element utahuga aur ussse minimum distance par zero find karuga 
        // agar vo visited nahi hai to use queue me push kar duga with the minimum distance : 
        while(!q.isEmpty()){

            // pick the first one from the queue : 
            int row = q.peek().first;
            int col = q.peek().second;
            int steps = q.peek().third;
            q.remove();

            // jo bhi maine 1 queue me remove kiya hai uski minimum distance 
            // apane ans me add kar do : 
            ans[row][col] = steps;

            // ab mai current 1 ki charo direction me traverse karuga : 
            for(int i = 0; i<4; i++){

                int nrow = row + delRow[i];
                int ncol = col + delcol[i];

                // this is the condition for count the minimum distance : 
                if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < n && 
                visited[nrow][ncol] == 0){

                    visited[nrow][ncol] = 1;
                    q.add(new Node(nrow , ncol , steps + 1));
                }
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
