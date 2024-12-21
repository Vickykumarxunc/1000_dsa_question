package _1basic;

import java.util.Scanner;

public class _43sumofArray {
    public static int sumOfArray(int arr[] , int n){
        int sum = 0;
        for(int i = 0; i<n; i++){
            sum += arr[i];
        }
        return sum;
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

        int sum_array = sumOfArray(arr, n);
        System.out.println("sum of the array is = " + sum_array);
         
    }
}
