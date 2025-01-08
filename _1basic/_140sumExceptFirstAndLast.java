package _1basic;

import java.util.Scanner;

public class _140sumExceptFirstAndLast {
    public static int sum(int arr[] , int n){
        
        int sum = 0;
        for(int i = 1; i < n - 1; i++){

            sum += arr[i];
        }
        return sum;
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

        int ans = sum(arr, n);
        System.out.println("sum except first and last = " + ans);
    }
}
