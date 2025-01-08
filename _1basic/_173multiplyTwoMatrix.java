package _1basic;

import java.util.Scanner;

public class _173multiplyTwoMatrix {
    public static int[][] multiply(int [][] matrix1 , int matrix2[][]){

        int n = matrix1.length;
        int ans[][] = new int[n][n];

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                for(int k = 0; k<n; k++){

                    ans[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the row  : ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        int matrix1[][] = new int[r1][c1];
        System.out.println("enter the matrix element : ");
        for(int i = 0; i<r1; i++){
            for(int j = 0; j < c1; j++){

                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("enter the size of the row  : ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
    
        int matrix2[][] = new int[r2][c2];
        System.out.println("enter the matrix element : ");
        for(int i = 0; i<r2; i++){
            for(int j = 0; j<c2; j++){
                matrix2[i][j] = sc.nextInt();
            }
        }

         int ans[][] = multiply(matrix1, matrix2);
         for(int i = 0; i<r1; i++){
            for(int j = 0; j<c1; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
         }
        
    }
}
