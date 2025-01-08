package _1basic;

import java.util.Scanner;

public class _163DifferenceBetweenSumOfDiagonal {

    public static int diagonalsumDifference(int matrix[][] , int n){

        int sum1 = 0; // clock diagonal sum : 
        int sum2 = 0; // anti diagonal sum : 
        int j = n - 1; 

        for(int i = 0; i<n; i++){

            sum1 += matrix[i][i];
            sum2 += matrix[i][j];
            j--;
        }
        int diagonal_diff = Math.abs(sum1 - sum2);
        return diagonal_diff;

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

        int ans = diagonalsumDifference(matrix1, r1);
        System.out.println("diagonal difference = " + ans);

    
    }
}
