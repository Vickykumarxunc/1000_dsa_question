package _1basic;

import java.util.Scanner;

public class _12rotate_array_by_one {
    public static void rotate_array(int arr[] , int n){

        // store the last element : 
        int last_element = arr[n -1];

        // traverse from the last : 
        for(int i = n - 1; i>0; i--){
            arr[i] = arr[i - 1];
        }
        // add the last element at first position : 
        arr[0] = last_element;
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

        rotate_array(arr, n);
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
