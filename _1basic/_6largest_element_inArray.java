package _1basic;

import java.util.Scanner;

public class _6largest_element_inArray {
    public static int largest(int arr[] , int n){

        int max = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
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

        int largest = largest(arr, n);
        System.out.println("largest element of the array = " + largest);
    }
}
