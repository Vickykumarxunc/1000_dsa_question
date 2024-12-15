package _1basic;

import java.util.Scanner;

public class _10min_max_array {
    public static void max_min(int arr[] , int ans[] , int n){

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        ans[0] = min;
        ans[1] = max;
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

        int ans[] = new int[2];
        max_min(arr, ans, n);

        System.out.println("minimum element in the array = " + ans[0]);
        System.out.println("maximum element in the array = " + ans[1]);
     }
    
}
