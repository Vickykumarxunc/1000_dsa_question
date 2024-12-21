package _1basic;

import java.util.Scanner;

public class _85balancedArray {
    public static int minValueToBalance(int arr[] , int n){
        int left_sum = 0;
        int right_sum = 0;

        for(int i = 0; i<n/2; i++){
            left_sum += arr[i];
        }
        for(int i = n/2; i<n; i++){
            right_sum += arr[i];
        }
        int min_value = Math.abs(right_sum - left_sum);
        return min_value;
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

        int ans = minValueToBalance(arr, n);
        System.out.println("minimum value that can be added = " + ans);
    }
    
}
