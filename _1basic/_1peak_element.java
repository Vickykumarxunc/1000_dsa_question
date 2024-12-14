package _1basic;

import java.util.Scanner;

public class _1peak_element{

    public static int peak_element(int arr[] , int n){

        int low = 0;
        int high = n - 1;
        int mid = 0;

        while(low <= high){

            mid = low + (high - low)/2;

            if(mid == 0 || arr[mid] >= arr[mid - 1] && (mid == n - 1 || arr[mid] >= arr[mid + 1])){
                
                break;
            }
            if(mid > 0 && arr[mid] < arr[mid - 1]){

                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return mid;
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

        int peakelement = peak_element(arr, n);
        System.out.println("peak element = " + peakelement);
        
    }
}