package _1basic;

import java.util.Scanner;

public class _15first_n_fibonacci {

    public static int[] fib(int n){

        int arr[] = new int[n];
        for(int i = 0; i<n; i++){

            if( i < 2){
                arr[i] = 1;
            }
            else{
                arr[i] = arr[i - 1] + arr[i - 2];
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();

        int fibonacci[] = fib(n);
        for(int i = 0; i<n; i++){
            System.out.print(fibonacci[i] + " ");
        }
    }
}
