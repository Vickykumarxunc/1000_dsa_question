package _2easy;

import java.util.Scanner;

public class _5Sort012 {

    public static void sort(int arr[] , int n){

        int low = 0;
        int high = n - 1;
        int mid = 0;

        while(mid <= high){

            if(arr[mid] == 0){

                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else if(arr[mid] == 2){

                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high]  = temp;
                high--;
            }
        }
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

        sort(arr, n);
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        
    }
}
