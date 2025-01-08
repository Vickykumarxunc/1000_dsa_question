package _1basic;

import java.util.Scanner;

public class _167Missing_number_in_suffledArray {

    public static int findMissing(int arr1[] , int arr2[] , int n , int m){

        int arr1_sum = 0;
        for(int i = 0; i<n; i++){
            arr1_sum += arr1[i];
        }
        int arr2_sum = 0;
        for(int i = 0; i<m; i++){
            arr2_sum += arr2[i];
        }
        int missing_number = arr1_sum - arr2_sum;
        return missing_number;
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

        
        System.out.println("enter the size of the array : ");
        int n2 = sc.nextInt();

        int arr2[] = new int[n];
        System.out.println("enter the array element : ");
        for(int i = 0; i<n2; i++){
            arr2[i] = sc.nextInt();
        }

        int missing_number = findMissing(arr, arr2, n, n2);
        System.out.println("missing number in the second array : = " + missing_number);
    }
}
