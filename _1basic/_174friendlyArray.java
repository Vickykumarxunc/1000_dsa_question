package _1basic;

import java.util.Scanner;

public class _174friendlyArray {

    public static int friendliness(int arr[] , int n){

        int sum = Math.abs(arr[0] - arr[n - 1]);

        for(int i = 0; i<n-1; i++){
            sum += Math.abs(arr[i] - arr[i + 1]);
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
        int ans = friendliness(arr, n);
        System.out.println(ans);
        
    }
}
