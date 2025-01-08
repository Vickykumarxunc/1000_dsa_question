package _4graph;

import java.util.Scanner;

public class _8floodFillAlgorithm {

    public static void dfs(int row , int col , int ans[][] , int image[][] , int newColor , int prevColor ,
    int delRow[] , int delCol[]){

        // change the color of current node : 
        ans[row][col] = newColor;
        int n = image.length;
        int m = image[0].length;

        for(int i = 0; i<4; i++){

            int nrow = row + delRow[i];
            int ncol = col + delCol[i];

            // suitable condition for the flood fill : 
            if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && 
            image[nrow][ncol] == prevColor && ans[nrow][ncol] != newColor){

                // apply the dfs for fill the new color : 
                dfs(nrow  , ncol , ans , image , newColor , prevColor , delRow , delCol);
            }
        }
    }

    public static int[][] floodFill(int image[][] , int sr , int sc , int newColor){

        // take previous color : 
        int previousColor = image[sr][sc];

        //copy the given matrix into another matrix : 
        int ans[][] = image;

        // each node have at most four neighbour 
        // and how to reach it neihbour 
        int delRow[] = {-1 , 0 , +1 , 0};
        int delCol[] = {0 , +1 , 0 , -1};

        // now traverse the given image by the dfs : 
        dfs(sr , sc , ans , image , newColor , previousColor , delRow , delCol);

        //return the ans : 
        return ans;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the row : ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int image[][] = new int[r][c];
        System.out.println("enter the color of the image : ");
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                image[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter the coordinate of the initial color : ");
        int sr = sc.nextInt();
        int scc = sc.nextInt();

        System.out.println("enter the new color : ");
        int newColor = sc.nextInt();

        int ans[][] = floodFill(image, sr, scc, newColor);
        
        // print the new matrix : 
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
