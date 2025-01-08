package _4graph;
import java.util.*;

public class _15NumberOfDistinctIsland {
    public static void dfs(int row , int col , int visited[][] , int grid[][] , ArrayList<String> vec , int row0 , int col0){

        visited[row][col] = 1;

        int n = grid.length;
        int m = grid[0].length;

        int delRow[] = {-1 , 0 , 1 , 0};
        int delCol[]  = {0 , -1 , 0 , 1};

        for(int i = 0; i<4; i++){
            int nrow = row + delRow[i];
            int ncol = col + delCol[i];

            if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && 
            visited[nrow][ncol] == 0 && grid[nrow][ncol] == 1){

                dfs(nrow , ncol , visited , grid , vec , row0 , col0);
            }
        }
    }
    public static int countDistinctIsland(int grid[][]){

        int n = grid.length;
        int m = grid[0].length;

        // create a visited array : 
        int visited[][] = new int[n][m];

        // create a hash set which store the structure of distinct graph  
        HashSet<ArrayList<String>> set = new HashSet<>();

        // traverse the grid : 
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){

                if(visited[i][j] == 0 && grid[i][j] == 1){

                    // create a  array list which store the base : 
                    ArrayList<String> vec = new ArrayList<>();

                    // call the dfs : 
                    dfs(i , j , visited , grid , vec , i , j);
                    set.add(vec);
                }
            }
        }
        return set.size();
    }
    public static void main(String[] args) {
        
        int grid[][] = {
            {1 , 1 , 0 , 0 , 0},
            {1 , 1 , 0 , 0 , 0 },
            {0 , 0 , 0 , 1 , 1},
            {0 , 0 , 0 , 1 , 1},
            {0 , 0 , 0 , 1 , 1}
        };

        int count = countDistinctIsland(grid);
        System.out.println("number of distinct island = " + count);
        
    }
    
}
