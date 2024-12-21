package _1basic;

import java.util.Scanner;

public class _120ReverseSubArray {
    public static void reverse(int arr[] , int n , int l , int r){

        // due to one based indexing : 
        int start = l - 1;
        int end = r - 1; 

        while(start < end){

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
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
        System.out.println("enter the range to reverse the array : ");
        int l = sc.nextInt();
        int r = sc.nextInt();
        
        reverse(arr, n, l, r);

        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
