package _1basic;

import java.util.Scanner;

public class _11sortedArraySearch {
    public static boolean sorted_search(int arr[] , int n , int target){

        int low = 0;
        int high = n - 1;
        
        while(low <= high){

            int mid = low + (high - low)/2;

            if(arr[mid] == target){
                return true;
            }
            else if(arr[mid] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return false;
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
        System.out.println("enter the array searched : ");
        int target = sc.nextInt();

        boolean ans = sorted_search(arr, n, target);
        System.out.println("element is present in the array or not =" + ans);
    }
}
