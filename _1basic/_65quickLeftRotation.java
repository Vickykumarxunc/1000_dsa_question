package _1basic;

import java.util.Scanner;

public class _65quickLeftRotation {
    public static void reverse(int arr[] , int i , int j){

        while(i < j){

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void rotate(int arr[] , int n , int k){

        k = k % n;
        reverse(arr , 0 , k - 1);
        reverse(arr , k , n - 1);
        reverse(arr , 0 , n - 1);
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
        System.out.println("Enter the rotation time : ");
        int k = sc.nextInt();

        rotate(arr, n, k);
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        
    }
}
