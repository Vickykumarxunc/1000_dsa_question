package _4graph;

public class _14NumberOfEnclaves {

    public static void dfs(int row , int col , int visited[][] , int grid[][] , int delRow[] , int delCol[]){

        visited[row][col] = 1;
        int n = grid.length;
        int m = grid[0].length;

        for(int i = 0; i<4; i++){
            int nrow = row + delRow[i];
            int ncol = col + delCol[i];

            if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && 
            visited[nrow][ncol] == 0 && grid[nrow][ncol] == 1){
                
                dfs(nrow , ncol , visited , grid , delRow , delCol);
            }
        }
    }
    public static int numberOfEnclaves(int grid[][]){

        int n = grid.length;
        int m = grid[0].length;

        int delRow[] = {-1 , 0 , 1 , 0};
        int delCol[] = {0 , 1 , 0 , -1};

        int visited[][] = new int[n][m];

        // first traverse the first row and and last row : 
        for(int j = 0; j<m; j++){

            // traverse the first row : 
            if(visited[0][j] == 0 && grid[0][j] == 1){

                // call the dfs : 
                dfs(0 , j , visited , grid , delRow , delCol);
            }
            // travese the last row : 
            if(visited[n - 1][j] == 0 && grid[n - 1][j] == 1){

                // call the dfs : 
                dfs(n - 1 , j , visited , grid , delRow , delCol);
            }

        }

            // traverse the first column and last column : 
            for(int i = 0; i<n; i++){

                // traverse the first column : 
                if(visited[i][0] == 0 && grid[i][0] == 1){

                    // call the dfs : 
                    dfs(i , 0 , visited ,grid , delRow , delCol);
                }
                if(visited[i][m - 1] == 0 && grid[i][m - 1] == 1){

                    // call the dfs : 
                    dfs(i , m - 1 , visited , grid , delRow , delCol);
                }
            }

         // counter the land those not connect the outer boundary : 
         int land_count = 0;
         for(int i = 0; i<n; i++){
             for(int j = 0; j<m; j++){

                 if(visited[i][j] == 0 && grid[i][j] == 1){

                     land_count++;
                 }
             }
         }
         return land_count;
    }
    public static void main(String[] args) {
        
        int grid[][] = {
            {0 , 0 , 0 , 0},
            {1, 0 , 1 , 0 },
            {0 , 1 , 1 , 0},
            {0 , 0 , 0 , 0}
        };

        int count = numberOfEnclaves(grid);
        System.out.println("number of land  = " + count);
    }
}
