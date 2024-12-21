package _1basic;

import java.util.Scanner;
import java.util.Arrays;

public class _34findTheMedian {
    public static int median(int arr[] , int n){

        // first sort the array ; 
        Arrays.sort(arr);

        // check the length of the array is even or odd : 
        if(n % 2 != 0){
            return arr[n/2];
        }
        else{
             
            int median = (arr[n/2] + arr[n/2 - 1])/2;
            return median;
        }
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

        int median = median(arr, n);
        System.out.println("median of the array is = " + median);

    }
}
