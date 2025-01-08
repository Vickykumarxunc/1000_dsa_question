package _1basic;

import java.util.Arrays;
import java.util.Scanner;

public class _172SumOfAlternateProduct {
    public static int altProduct(int arr[] , int n){

        // first sort the array : 
        Arrays.sort(arr);
        int sum = 0;

        for(int i = 0; i<n/2; i++){
            sum += arr[i] * arr[n - i - 1];
        }
        return sum;
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

        int ans = altProduct(arr, n);
        System.out.println(ans);
    }
}
