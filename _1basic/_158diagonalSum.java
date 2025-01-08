package _1basic;

import java.util.Scanner;

public class _158diagonalSum {

    public static int DiagonalSum(int matrix[][] , int n){

        int sum = 0;
        int j = n - 1; // traverse for the anti diagonal : 

        for(int i = 0; i<n; i++){

            sum += matrix[i][i];
            sum += matrix[i][j];
            j--;
        }
        return sum;
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

        int diagonal_sum = DiagonalSum(matrix1, r1);
        System.out.println(diagonal_sum);
        
    }
}
