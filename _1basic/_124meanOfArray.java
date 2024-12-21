package _1basic;

import java.util.Scanner;

public class _124meanOfArray {
    public static int findMean(int arr[] , int n){

        int total_sum = 0;
        for(int i = 0; i<n; i++){
            total_sum += arr[i];
        }
        int mean = total_sum/n;
        return mean;
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
        int mean = findMean(arr, n);
        System.out.println("mean of the array = " + mean);

    }
}
