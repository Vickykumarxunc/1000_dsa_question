package _1basic;

import java.util.Scanner;

public class _170ReducingWalls {

    public static int reducingWalls(int arr[] , int n , int k){

        int count = 0;
        for(int i = 0; i<arr.length; i++){

            if(arr[i] > k){
                while(arr[i] > k){
                    arr[i] = arr[i] - k;
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("enter the array element : ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the value of k : ");
        int k = sc.nextInt();

        int ans = reducingWalls(arr, n, k);
        System.out.println("minimum number of operation required = " + ans);
        
         
    }
}
