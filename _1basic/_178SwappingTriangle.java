package _1basic;

import java.util.Scanner;

public class _178SwappingTriangle {

    public static void transposeMatrix(int matrix[][]){
        for(int i = 0; i<matrix.length; i++){
            for(int j = i + 1; j<matrix.length; j++){

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
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

        transposeMatrix(matrix1);
        for(int i = 0; i<r1; i++){
            for(int j = 0; j<r1; j++){

                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
