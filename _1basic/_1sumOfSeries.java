package _1basic;

import java.util.Scanner;

public class _1sumOfSeries {

    public static int sum_of_n_natural_number(int n){

        int sum = (n * (n + 1))/2;
        return sum;
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number : ");
    int n = sc.nextInt();

    int sum = sum_of_n_natural_number(n);
    System.out.println("sum of n natural number = " + sum);
    

   } 
    
}
