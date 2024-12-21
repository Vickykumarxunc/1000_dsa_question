package _1basic;

import java.util.Scanner;

public class _59exceptionallyOdd {
    public static int exceptionally_odd(int arr[] , int n){

        int result = arr[0];
        for(int i = 1; i<n; i++){

            result = result ^ arr[i];
        }
        return result;
    }
    public static void main(String[] args) {
            System.out.println("enter the size of the array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("enter the array element : ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int result = exceptionally_odd(arr, n);
        System.out.println("exceptionally odd number = " + result);
    }
}
