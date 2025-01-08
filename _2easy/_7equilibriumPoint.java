package _2easy;

import java.util.Scanner;

public class _7equilibriumPoint {

    public static int equilibriumPoint(int arr[] , int n){

        // first find the total sum : 
        int total_sum = 0;
        for(int i = 0; i<n; i++){
            total_sum += arr[i];
        }
        // now maintain the left sum and right sum : 
        int left_sum = 0;
        int right_sum = total_sum;

        for(int i = 0; i<n; i++){

            right_sum -= arr[i];

            // check the left sum is equal to the right sum or not : 
            if(left_sum == right_sum){
                return i + 1;
            }
            left_sum += arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n = sc.nextInt();
        System.out.println("enter the array element : ");
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int ans = equilibriumPoint(arr, n);
        System.out.println("equilibrium point of the array is = " + ans);
        
    }
}
