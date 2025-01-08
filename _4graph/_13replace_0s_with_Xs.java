package _4graph;

public class _13replace_0s_with_Xs {

    public static void dfs(int row , int col , int visited[][] , char mat[][] , int delRow[] , int delCol[]){

        // first mark the boundary zero in the visited array : 
        visited[row][col] = 1;
        int n = mat.length;
        int m = mat[0].length;

        // check for the top right bottom left : 
        for(int i = 0; i<4; i++){
            int nrow = row + delRow[i];
            int ncol = col + delCol[i];

            if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && 
            visited[nrow][ncol] == 0 && mat[nrow][ncol] == 'O'){

                // call the dfs : 
                dfs(nrow , ncol , visited , mat , delRow , delCol);
            }
        }
    }
    public static char[][] fill(int n , int m , char mat[][]){
        
        // mai matrix ki boundary par traverse karuga 
        // agar boundary traverse me kahi zero(0) present hai to us par dfs laga kar 
        // un set of zero ko hum x se convert nahi kar sakte . 
        // dfs call karte vakt un zero ko mai visited array me mark kar duga  : 
        
        // mai sirf 4 direction me hi traverse kar sakta hoon : 
        int delRow[] = {-1 , 0 , 1 , 0};
        int delCol[] = {0 , 1 , 0 , -1};

        // create a visited array : 
        int visited[][] = new int[n][m];

        // traverse the first row and last row : 
        for(int j = 0; j < m; j++){

            // traverse the first row : 
            if(visited[0][j] == 0 && mat[0][j] == 'O'){

                // call the dfs 
                dfs(0 , j , visited , mat , delRow , delCol);
            }
            if(visited[n - 1][j] == 0 && mat[n - 1][j] == 'O'){

                // call the dfs
                dfs(n - 1 , j , visited , mat , delRow , delCol);
            }
        }

        // traverse the left column and right column  : 
        for(int i = 0; i<n; i++){

            // traverse the left column : 
            if(visited[i][0] == 0 && mat[i][0] == 'O'){
                
                // call the dfs 
                dfs(i , 0 , visited , mat , delRow , delCol);
            }
            // traverse the right column : 
            if(visited[i][m - 1] == 0 && mat[i][m - 1] == 'O'){

                // call the dfs : 
                dfs(i , m - 1 , visited , mat , delRow , delCol);
            }
        }

        // ab mai pure matrix par traverse karuga 
        // aur un zero ko x me convert karuga jo outer zero wali boundary se connected nahi hai : 
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(visited[i][j] == 0 && mat[i][j] == 'O'){
                    mat[i][j] = 'X';
                }
            }
        }
        return mat;
    }
    public static void main(String[] args) {
        
        char mat[][] = {
            {'X' , 'X' , 'X' , 'X'},
            {'X' , 'O' , 'X' , 'X'},
            {'X' , 'O' , 'O' , 'X'},
            {'X' , 'O' , 'X' , 'X'},
            {'X' , 'X' , 'O' , 'O'}
        };
        int n = mat.length;
        int m = mat[0].length;

        char ans[][] = fill(n, m, mat);
        
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    
}
