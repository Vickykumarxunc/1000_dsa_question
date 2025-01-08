package _1basic;

import java.util.Scanner;

public class _154sumArrayPuzzle {

    /*
     * sum of the array except it self : 
     */
    public static int[] sumArray(int arr[] , int n){

        // first find the total array sum : 
        int total_sum = 0;
        for(int i = 0; i<n; i++){
            total_sum += arr[i];
        }

        for(int i = 0; i<n; i++){
            arr[i] = total_sum - arr[i];
        }
        return arr;
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

        int ans[] = sumArray(arr, n);
        for(int i = 0; i<n; i++){
            System.out.print(ans[i] + " ");
        }
        
        
    }
}
