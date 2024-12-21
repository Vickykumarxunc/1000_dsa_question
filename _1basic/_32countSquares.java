package _1basic;

import java.util.Scanner;

public class _32countSquares {
    public static int count_square(int n){

        // count the number of square are less than or equal to the give number (n)
        int count = 0;
        for(int i = 1; i * i < n; i++){
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();

        int no_of_square = count_square(n);
        System.out.println("total square = " + no_of_square);
        
    }
    
}
