package _1basic;

import java.util.Scanner;

public class _81multiply_left_right_array_sum {
    public static int multiply(int arr[] , int n){

        int left_sum = 0;
        int right_sum = 0;
        int product = 0;

        for(int i = 0; i<n/2; i++){
            left_sum += arr[i];
        }
        for(int i = n/2; i< n; i++){
            right_sum += arr[i];
        }

        product = left_sum * right_sum;
        return product;
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

        int ans = multiply(arr, n);
        System.out.println("multiply left and right array sum = " + ans);
    }
}
