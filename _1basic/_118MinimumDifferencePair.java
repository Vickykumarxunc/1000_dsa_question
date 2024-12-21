package _1basic;

import java.util.Arrays;
import java.util.Scanner;

public class _118MinimumDifferencePair {
    /* Given an unsorted array, find the minimum difference between any pair in given array. */
    public static int minDiff(int arr[] , int n){

        // first sort the array : 
        Arrays.sort(arr);
        int min_diff = arr[1] - arr[0];
        
        // traverse the array from the 2 : 
        for(int i = 2; i<n; i++){

            int current_diff = arr[i] - arr[i - 1];
            min_diff = Math.min(current_diff , min_diff);
        }
        return min_diff;
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

        int min_diff = minDiff(arr, n);
        System.out.println("minimum difference between the pair = " + min_diff);
        
    }
}
