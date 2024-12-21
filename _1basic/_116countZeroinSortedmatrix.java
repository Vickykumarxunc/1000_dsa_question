package _1basic;

import java.util.Scanner;

public class _116countZeroinSortedmatrix {

    /// each row and column of the matrix is sorted in ascending order  : 
    /// find the total number of zeroes present in the matrix ; 
    public static int countZeros(int mat[][]){

        int n = mat.length;
        int count = 0;
        // use the two pointer approach : 
        int i = 0; 
        int j = n - 1;

        while(i < n && j >= 0){


            if(mat[i][j] == 1){
                j--;
            }
            else{
                count += j + 1;
                i++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row number : ");
        int r = sc.nextInt();
        System.out.println("enter the column number : ");
        int c = sc.nextInt();
        
        int mat[][] = new int[r][c];
        System.out.println("enter the 0 1 in the matrix : ");
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        int total_zeroes = countZeros(mat);
        System.out.println("total no of zeroes prsent in the matrix = " + total_zeroes);
    }
}
