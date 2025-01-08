package _2easy;

import java.util.Scanner;

public class _9binarySearch {
    public static int binary_search(int arr[] , int n , int target){

        int low = 0;
        int high = n - 1;

        while(low <= high){

            int mid = low + (high - low)/2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){

                high = mid - 1;
            }
            else{

                low = mid + 1;
            }
        }
        return -1;

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
            System.out.println("enter the target element : ");
            int target = sc.nextInt();

            int index = binary_search(arr, n, target);
            System.out.println("index of the " + target + " = " + index);
            
    }
}