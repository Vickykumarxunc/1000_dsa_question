package _1basic;

import java.util.Scanner;

public class _150longestIncreasingSubArray {
    public static int lenOfLongest(int arr[] , int n){

        int length = 1;
        int max_length = Integer.MIN_VALUE;
        for(int i = 1; i<n; i++){
            if(arr[i] > arr[i - 1]){
                length++;
            }
            else{
                length = 1;
            }
            max_length = Math.max(max_length , length);
        }
        return max_length;
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

        int ans = lenOfLongest(arr, n);
        System.out.println("length of the longest increasing subarray = " + ans);
        
    }
}
