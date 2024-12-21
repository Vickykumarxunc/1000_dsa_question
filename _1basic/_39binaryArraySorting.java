package _1basic;

import java.util.Scanner;

public class _39binaryArraySorting {
    public static void binSort(int arr[] , int n){

        int k = 0;
        for(int i = 0; i<n; i++){

            if(arr[i] != 1){
                arr[k] = arr[i];
                k++;
            }
        }
        while(k < n){
            arr[k] = 1;
            k++;
        }
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
        binSort(arr, n);
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

}
