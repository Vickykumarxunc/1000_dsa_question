 package _1basic;

import java.util.Scanner;

class _72ishaanLovesChocolate {
    public static int min(int arr[] , int n){

        int min = arr[0];
        for(int i = 1; i<n; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
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

        int ans = min(arr, n);
        System.out.println("last chocolate square = " + ans);

    }
    
}